@SauceDemo
Feature: The full process of an order in the SauceDemo app
  As a potential client
  I want to make an order in the app
  So that I can use its service

  @MakeAnOrder
  Scenario: The client finds a product, logs in, fills the forms and make an order
    Given The SauceDemo app is loaded correctly
    When The client scrolls down until the product "Sauce Labs Backpack (red)" is visible and taps on its image
    Then The client should be on the product detail screen

    When The client taps the Add to cart button
    And The client taps on the cart badge
    Then The client should be on the cart detail screen

    When The client taps on the Proceed to checkout button
    Then The client should be on the login screen

    When The client fills the form with the login default values
    And The client taps on the Login button
    Then The client should be on the shipping form screen

    When The client fills the form with the shipping default values
    And The client taps on the To payment button
    Then The client should be on the payment form screen

    When The client fills the form with the payment default values
    And The client taps on the Review order button
    Then The client should be on the Checkout review screen

    When The client taps on the Place order button
    Then The client should be on the Checkout complete screen and see the Thank you for your order message

  @MakeAnOrderOutline
  Scenario Outline: The client finds a product, logs in, fills the forms and make an order
    Given The SauceDemo app is loaded correctly
    When The client scrolls down until the product "<product>" is visible and taps on its image
    Then The client should be on the product detail screen

    When The client taps the Add to cart button
    And The client taps on the cart badge
    Then The client should be on the cart detail screen

    When The client taps on the Proceed to checkout button
    Then The client should be on the login screen

    When The client fills the form with the login default values
    And The client taps on the Login button
    Then The client should be on the shipping form screen

    When The client fills the form with the shipping default values
    And The client taps on the To payment button
    Then The client should be on the payment form screen

    When The client fills the form with the payment default values
    And The client taps on the Review order button
    Then The client should be on the Checkout review screen

    When The client taps on the Place order button
    Then The client should be on the Checkout complete screen and see the Thank you for your order message

    Examples:
      | product                      |
      | Sauce Labs Backpack          |
      | Sauce Labs Backpack (green)  |
      | Sauce Labs Backpack (violet) |
      | Sauce Labs Backpack (red)    |
      | Sauce Labs Bike Light        |
      | Sauce Labs Onesie            |