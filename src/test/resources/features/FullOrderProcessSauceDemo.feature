@SauceDemo
Feature: Full order workflow in the SauceDemo app
  As a potential client
  I want to complete a purchase
  So that I can use the service

  Background:
    Given The SauceDemo app is loaded correctly

  @MakeAnOrder @Smoke @Regression
  Scenario: The user completes an order successfully
    When The user selects the product "Sauce Labs Backpack (red)"
    And The user adds the product to the cart
    And The user proceeds to checkout
    And The user logs in with the default credentials
    And The user completes the checkout form with default values
    And The user completes the payment form with default values
    And The user reviews and confirms the order
    Then The user should see the order confirmation message


  @MakeAnOrderOutline @Regression
  Scenario Outline: The user finds a product, logs in, fills the forms and make an order
    When The user selects the product "<product>"
    And The user adds the product to the cart
    And The user proceeds to checkout
    And The user logs in with the default credentials
    And The user completes the checkout form with default values
    And The user completes the payment form with default values
    And The user reviews and confirms the order
    Then The user should see the order confirmation message

    Examples:
      | product                      |
      | Sauce Labs Backpack          |
      | Sauce Labs Backpack (green)  |
      | Sauce Labs Backpack (violet) |
      | Sauce Labs Backpack (red)    |
      | Sauce Labs Bike Light        |
      | Sauce Labs Onesie            |


  @MakeAnOrderAndRateATheProduct @Regression @TPFinal
  Scenario Outline: The user makes an order and rates a product
    When The user makes a "<product>" order and continues shopping
    And The user selects the product "<product>"
    And The user rates the product with <stars> stars
    Then The user should see a thanks for rating message

    Examples:
      | product                      | stars |
      | Sauce Labs Backpack          | 4     |
      | Sauce Labs Backpack (green)  | 2     |
      | Sauce Labs Backpack (violet) | 5     |
