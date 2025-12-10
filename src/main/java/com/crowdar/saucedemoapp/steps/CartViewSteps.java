package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.CartViewService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartViewSteps {

    @When("The client taps on the Remove item link")
    public void theClientTapsOnTheRemoveItemLink() {
        CartViewService.clickRemove();
    }

    @Then("The message of No items should be visible on the top center")
    public void theMessageOfShouldBeVisibleOnTheTopCenter() {
        CartViewService.isNoItemDisplayed();
    }

    @And("The client proceeds to checkout")
    public void theClientProceedsToCheckout() {
        CartViewService.isCartViewLoaded();
        CartViewService.clickProceedToCheckout();
    }

    @And("The client removes the product from the cart")
    public void theClientRemovesTheProductFromTheCart() {
        CartViewService.clickRemove();
    }

    @Then("The client should see a message indicating that there are no items in the cart")
    public void theClientShouldSeeAMessageIndicatingThatThereAreNoItemsInTheCart() {
        CartViewService.isNoItemDisplayed();
    }
}
