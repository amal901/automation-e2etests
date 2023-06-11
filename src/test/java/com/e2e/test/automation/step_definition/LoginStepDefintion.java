package com.e2e.test.automation.step_definition;

import com.e2e.test.automation.page_objects.LoginPage;
import com.e2e.test.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefintion {

	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils;
	public LoginStepDefintion() {
		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
	}
	@Given("Je me connecte sur l application Nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
		loginPage.gotoUrl();
	}

	@When("Je saisis le username {string}")
	public void jeSaisisLeUsername(String email) {
		seleniumUtils.writeText(LoginPage.getEmail(), email);
	}

	@When("Je saisis le mot le passe {string}")
	public void jeSaisisLeMotLePasse(String password) {
		seleniumUtils.writeText(LoginPage.getPasword(), password);
	}

	@When("Je clique sur le bouton LOGIN")
	public void jeCliqueSurLeBoutonLOGIN() {
		seleniumUtils.click(LoginPage.getBtnLogin());
	}

	@Then("Je me rederige vers la page home {string}")
	public void jeMeRederigeVersLaPageHome(String string) {

	}

}
