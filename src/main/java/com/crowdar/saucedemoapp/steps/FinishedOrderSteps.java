package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.FinishedOrderService;
import io.cucumber.java.en.Then;

public class FinishedOrderSteps {

    @Then("The client should be on the Checkout complete screen and see the Thank you for your order message")
    public void theClientShouldBeOnTheCheckoutCompleteScreenAndSeeTheThankYouForYourOrderMessage() {
        FinishedOrderService.isFinishedOrderVisible();
    }
}
