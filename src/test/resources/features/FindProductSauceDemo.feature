@SauceDemo
Feature: Find a product in the SauceDemo main screen
  As a potential client
  I want to find an specific product
  So that I can proceed buying it

  @FindAProduct
  Scenario: The client finds a product in the main screen
    Given The SauceDemo app is loaded correctly
    When The client scrolls down to find the product "Test.allTheThings() T-Shirt (purple)"
    Then The client can see the "Test.allTheThings() T-Shirt (purple)" title