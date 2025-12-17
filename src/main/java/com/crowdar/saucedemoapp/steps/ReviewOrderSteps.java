package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.ReviewOrderService;
import io.cucumber.java.en.And;

public class ReviewOrderSteps {

    @And("The user reviews and confirms the order")
    public void theClientReviewsAndConfirmsTheOrder() {
        ReviewOrderService.isReviewVisible();
        ReviewOrderService.clickPlaceOrder();
    }
}
