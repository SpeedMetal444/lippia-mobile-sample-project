@SauceDemo
Feature: Add and remove products in the SauceDemo app
  As a potential client
  I want to manage items in the cart
  So that I can add or remove products

  Background:
    Given The SauceDemo app is loaded correctly

  @AddAProductToCart
  Scenario: The client selects a product and adds it to the cart
    When The client selects the product "Sauce Labs Backpack (violet)"
    And The client adds the product to the cart
    Then The cart badge count should show "2"


  @AddAndRemoveAnItem
  Scenario: The client selects a product, adds it to the cart and removes it
    When The client selects the product "Sauce Labs Backpack (orange)"
    And The client adds the product to the cart
    And The client proceeds to the cart
    And The client removes the product from the cart
    Then The client should see a message indicating that there are no items in the cart
