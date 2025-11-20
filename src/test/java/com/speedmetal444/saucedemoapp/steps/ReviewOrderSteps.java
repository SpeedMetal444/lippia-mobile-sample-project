package com.speedmetal444.saucedemoapp.steps;

import com.speedmetal444.saucedemoapp.services.ReviewOrderService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewOrderSteps {

    @Then("The client should be on the Checkout review screen")
    public void theClientShouldBeOnTheCheckoutReviewScreen() {
        ReviewOrderService.isReviewVisible();
    }

    @When("The client taps on the Place order button")
    public void theClientTapsOnThePlaceOrderButton() {
        ReviewOrderService.clickPlaceOrder();
    }
}
