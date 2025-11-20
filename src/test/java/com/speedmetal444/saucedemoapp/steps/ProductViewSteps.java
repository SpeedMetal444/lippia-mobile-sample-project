package com.speedmetal444.saucedemoapp.steps;

import com.speedmetal444.saucedemoapp.services.ProductViewService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductViewSteps {

    @Then("The client should be on the product detail screen")
    public void theClientShouldBeOnTheProductDetailScreen() {
        ProductViewService.isProductViewLoaded();
    }

    @When("The client taps the Add to cart button")
    public void theClientTapsTheAddButton() {
        ProductViewService.clickAddToCart();
    }

    @Then("The cart badge count should be visible on the top right with (.*) item")
    public void theCartBadgeCountShouldBeVisibleOnTheTopRight(String quantity) {
        ProductViewService.isCartBadgeCountVisible(quantity);
    }

    @When("The client taps on the + button")
    public void theClientTapsOnTheButton() {
        ProductViewService.clickIncreaseItem();
    }

    @When("The client taps on the cart badge")
    public void theClientTapsOnTheCartButton() {
        ProductViewService.clickCart();
    }
}
