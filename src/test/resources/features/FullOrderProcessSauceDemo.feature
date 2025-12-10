@SauceDemo
Feature: Full order workflow in the SauceDemo app
  As a potential client
  I want to complete a purchase
  So that I can use the service

  Background:
    Given The SauceDemo app is loaded correctly

  @MakeAnOrder
  Scenario: The client completes an order successfully
    When The client selects the product "Sauce Labs Backpack (red)"
    And The client adds the product to the cart
    And The client proceeds to checkout
    And The client logs in with the default credentials
    And The client completes the shipping form with default values
    And The client completes the payment form with default values
    And The client reviews and confirms the order
    Then The client should see the order confirmation message


  @MakeAnOrderOutline
  Scenario Outline: The client finds a product, logs in, fills the forms and make an order

    When The client selects the product "<product>"
    And The client adds the product to the cart
    And The client proceeds to checkout
    And The client logs in with the default credentials
    And The client completes the shipping form with default values
    And The client completes the payment form with default values
    And The client reviews and confirms the order
    Then The client should see the order confirmation message

    Examples:
      | product                      |
      | Sauce Labs Backpack          |
      | Sauce Labs Backpack (green)  |
      | Sauce Labs Backpack (violet) |
      | Sauce Labs Backpack (red)    |
      | Sauce Labs Bike Light        |
      | Sauce Labs Onesie            |