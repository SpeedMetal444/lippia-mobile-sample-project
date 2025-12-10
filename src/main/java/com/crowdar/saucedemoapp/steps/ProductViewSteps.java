package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.ProductViewService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductViewSteps {

    @Then("The cart badge count should be visible on the top right with (.*) item")
    public void theCartBadgeCountShouldBeVisibleOnTheTopRight(String quantity) {
        ProductViewService.isCartBadgeCountVisible(quantity);
    }

    @When("The client taps on the + button")
    public void theClientTapsOnTheButton() {
        ProductViewService.clickIncreaseItem();
    }

    @And("The client adds the product to the cart")
    public void theClientAddsTheProductToTheCart() {
        ProductViewService.isProductViewLoaded();
        ProductViewService.clickAddToCart();
        ProductViewService.clickCart();
    }

    @Then("The cart badge count should show (.*)")
    public void theCartBadgeCountShouldShow(String quantity) {
        ProductViewService.isCartBadgeCountVisible(quantity);
    }

    @And("The client proceeds to the cart")
    public void theClientProceedsToTheCart() {
        ProductViewService.clickCart();
    }
}
