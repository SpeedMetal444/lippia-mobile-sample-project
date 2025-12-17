package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.FinishedOrderService;
import cucumber.api.PendingException;
import io.cucumber.java.en.Then;

public class FinishedOrderSteps {

    @Then("The user should see the order confirmation message")
    public void theClientShouldSeeTheOrderConfirmationMessage() {
        FinishedOrderService.isFinishedOrderVisible();
    }
}
