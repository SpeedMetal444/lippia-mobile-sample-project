package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.CartViewService;
import com.crowdar.saucedemoapp.services.ProductViewService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartViewSteps {

    @When("The user taps on the Remove item link")
    public void theClientTapsOnTheRemoveItemLink() {
        CartViewService.clickRemove();
    }

    @Then("The message of No items should be visible on the top center")
    public void theMessageOfShouldBeVisibleOnTheTopCenter() {
        CartViewService.isNoItemDisplayed();
    }

    @And("The user proceeds to checkout")
    public void theClientProceedsToCheckout() {
        CartViewService.isCartViewLoaded();
        CartViewService.clickProceedToCheckout();
    }

    @And("The user removes the product from the cart")
    public void theClientRemovesTheProductFromTheCart() {
        CartViewService.clickRemove();
    }

    @Then("The user should see a message indicating that there are no items in the cart")
    public void theClientShouldSeeAMessageIndicatingThatThereAreNoItemsInTheCart() {
        CartViewService.isNoItemDisplayed();
    }

    @And("The user clicks the + button {int} times")
    public void theUserClicksTheButtonTimes(int times) {
        for (int i = 0; i < times; i++) {
            ProductViewService.clickIncreaseItem();
        }
    }
}
