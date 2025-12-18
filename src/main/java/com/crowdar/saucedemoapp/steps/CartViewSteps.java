package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.CartViewService;
import com.crowdar.saucedemoapp.services.ProductViewService;
import cucumber.api.PendingException;
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
        ProductViewService.clickIncreaseItemNTimes(times);
    }

    @Then("The user should see the {string} and {string} in the cart view")
    public void theUserShouldSeeTheAndInTheCartView(String product1, String product2) {
        CartViewService.isItemDisplayed(product1);
        CartViewService.isItemDisplayed(product2);
    }
}
