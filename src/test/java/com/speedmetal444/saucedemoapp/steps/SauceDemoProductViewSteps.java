package com.speedmetal444.saucedemoapp.steps;

import com.speedmetal444.saucedemoapp.services.SauceDemoProductViewService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoProductViewSteps {

    @Then("The client should be on the product detail screen")
    public void theClientShouldBeOnTheProductDetailScreen() {
        SauceDemoProductViewService.isProductViewLoaded();
    }

    @When("The client taps the Add to cart button")
    public void theClientTapsTheAddButton() {
        SauceDemoProductViewService.clickAddToCart();
    }

    @Then("The cart badge count should be visible on the top right with (.*) item")
    public void theCartBadgeCountShouldBeVisibleOnTheTopRight(String quantity) {
        SauceDemoProductViewService.isCartBadgeCountVisible(quantity);
    }

    @When("The client taps on the + button")
    public void theClientTapsOnTheButton() {
        SauceDemoProductViewService.clickAddItem();
    }
}
