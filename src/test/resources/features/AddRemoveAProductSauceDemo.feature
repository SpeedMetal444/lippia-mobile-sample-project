@SauceDemo
Feature: Add and remove a product on the SauceDemo app
  As a potential client
  I want to interact with the cart
  So that I can add or remove items

  Background:
    Given The SauceDemo app is loaded correctly

  @AddAProductToCart
  Scenario: The client finds a product in the main screen and adds it to the cart
    When The client scrolls down until the product "Sauce Labs Backpack (violet)" is visible
    And The client taps on the "Sauce Labs Backpack (violet)" image
    Then The client should be on the product detail screen
    When The client taps on the + button
    And The client taps the Add to cart button
    Then The cart badge count should be visible on the top right with 2 item

  @AddAndRemoveAnItem
  Scenario: The client finds a product in the main screen, adds it and then removes it from cart
    When The client scrolls down until the product "Sauce Labs Backpack (violet)" is visible
    And The client taps on the "Sauce Labs Backpack (violet)" image
    Then The client should be on the product detail screen
    When The client taps the Add to cart button
    And The client taps on the cart badge
    Then The client should be on the cart detail screen
    When The client taps on the Remove item link
    Then The message of No items should be visible on the top center