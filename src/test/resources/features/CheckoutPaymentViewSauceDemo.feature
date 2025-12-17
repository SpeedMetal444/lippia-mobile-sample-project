@SauceDemo
Feature: Filling the Checkout and Payment forms in the SauceDemo app
  As a potential client
  I want to complete the necessary forms
  So that I can proceed with an order

  Background:
    Given The SauceDemo app is loaded correctly
    And The user selects the product "Sauce Labs Backpack"
    And The user adds the product to the cart
    And The user proceeds to checkout
    And The user logs in with the default credentials

  @CompleteCheckoutForm
  Scenario: The user completes the checkout form with his information
    When The user completes the checkout form with "Abel Godoy" full name, "9 de julio 1877" address, "Corrientes" city, "3400" zip code and "Argentina" country
    Then The user should be payment form screen