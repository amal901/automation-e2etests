package com.e2e.test.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2e.test.automation.utils.BasePage;
import com.e2e.test.automation.utils.ConfigFileReader;
import com.e2e.test.automation.utils.Setup;

public class LoginPage extends BasePage{
	
	public ConfigFileReader configFileReader;
	
	/*Retrieve Element*/
	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;
	
	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;

	public LoginPage() {
		super(Setup.getDriver());
		configFileReader = new ConfigFileReader();
		}
	
	/*Create method*/
	public void gotoUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	
	public void fillEmail(String mail) {
		email.clear();
		email.sendKeys(mail);
	}
	
	public void fillPassword(String keyword) {
		password.clear();
		password.sendKeys(keyword);
	}
	
	public void clickOnBtnLogin() {
		btnLogin.click();
	}
	
	/*GETTER*/
	
	public static WebElement getEmail() {
		return email;
	}
	
	public static WebElement getPasword() {
		return password;
	}
	
	public static WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
