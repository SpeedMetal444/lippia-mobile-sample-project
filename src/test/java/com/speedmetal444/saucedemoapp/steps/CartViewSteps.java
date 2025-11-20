package com.speedmetal444.saucedemoapp.steps;

import com.speedmetal444.saucedemoapp.services.CartViewService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartViewSteps {

    @Then("The client should be on the cart detail screen")
    public void theClientShouldBeOnTheCartDetailScreen() {
        CartViewService.isCartViewLoaded();
    }

    @When("The client taps on the Remove item link")
    public void theClientTapsOnTheRemoveItemLink() {
        CartViewService.clickRemove();
    }

    @Then("The message of No items should be visible on the top center")
    public void theMessageOfShouldBeVisibleOnTheTopCenter() {
        CartViewService.isNoItemDisplayed();
    }
}
