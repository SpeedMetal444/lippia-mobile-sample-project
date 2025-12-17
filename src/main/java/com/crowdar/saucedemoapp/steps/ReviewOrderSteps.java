package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.ReviewOrderService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ReviewOrderSteps {

    @And("The user reviews and confirms the order")
    public void theClientReviewsAndConfirmsTheOrder() {
        ReviewOrderService.isReviewVisible();
        ReviewOrderService.clickPlaceOrder();
    }

    @Then("The user should be on the Review order screen")
    public void theUserShouldBeOnTheReviewOrderScreen() {
        ReviewOrderService.isReviewVisible();
    }
}
