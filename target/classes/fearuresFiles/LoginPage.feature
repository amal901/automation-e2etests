@authentification
Feature: Authentification de login de l application Nopcommerce
  En tant que utilisateur je souhaite naviguer sur l application SwagLabs

Background: 
    Given Je me connecte sur l application Nopcommerce
    When Je saisis le username "admin@yourstore.com"
    And Je saisis le mot le passe "admin"
    And Je clique sur le bouton LOGIN

  @login_CasPsassant
  Scenario: Authentification sur l application Nopcommerce - Cas Passant
    Then Je me rederige vers la page home "PRODUCTS"