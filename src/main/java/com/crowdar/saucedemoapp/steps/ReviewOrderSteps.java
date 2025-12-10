package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.ReviewOrderService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewOrderSteps {

    @And("The client reviews and confirms the order")
    public void theClientReviewsAndConfirmsTheOrder() {
        ReviewOrderService.isReviewVisible();
        ReviewOrderService.clickPlaceOrder();
    }
}
