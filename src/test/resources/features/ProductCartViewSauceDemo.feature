@SauceDemo
Feature: Add and remove products in the SauceDemo app
  As a potential client
  I want to manage items in the cart
  So that I can add or remove products

  Background:
    Given The SauceDemo app is loaded correctly

  @AddAProductToCart @Smoke @Regression
  Scenario: The user selects a product and adds it to the cart
    When The user selects the product "Sauce Labs Backpack (violet)"
    And The user adds the product to the cart
    Then The cart badge count should show 1

  @AddAProductToCartTwice @Regression
  Scenario: The user selects a product and adds two items of it to the cart
    When The user selects the product "Sauce Labs Backpack (red)"
    And The user clicks the + button
    And The user adds the product to the cart
    Then The cart badge count should show 2

  @AddTwoProductsToCart @Regression @TPFinal
  Scenario Outline: The user selects two products and adds it to the cart
    When The user selects the product "<product1>"
    And The user adds the product to the cart and comes back to the catalog
    And The user selects the product "<product2>"
    And The user adds the product to the cart
    Then The user should see the "<product1>" and "<product2>" in the cart view

    Examples:
      | product1                     | product2                     |
      | Sauce Labs Backpack (orange) | Sauce Labs Backpack (violet) |

  @AddAndRemoveAnItem @Regression
  Scenario: The user selects a product, adds it to the cart and removes it
    When The user selects the product "Sauce Labs Backpack (orange)"
    And The user adds the product to the cart
    And The user proceeds to the cart
    And The user removes the product from the cart
    Then The user should see a message indicating that there are no items in the cart

  @IncreaseItemQuantity @Regression @TPFinal
  Scenario: The user selects a product and adds N items of it to the cart
    When The user selects the product "Sauce Labs Backpack (yellow)"
    And The user adds the product to the cart
    And The user clicks the + button 3 times
    Then The cart badge count should show 4

  @RatingAProduct @Regression
  Scenario: The user selects a product and gives it N stars
    When The user selects the product "Sauce Labs Backpack (red)"
    And The user rates the product with 1 stars
    Then The user should see a thanks for rating message
