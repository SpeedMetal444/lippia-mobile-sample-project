package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.PaymentService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PaymentSteps {

    @And("The user completes the payment form with default values")
    public void theClientCompletesThePaymentFormWithDefaultValues() {
        PaymentService.isPaymentVisible();
        PaymentService.fillFormDefault();
        PaymentService.clickReviewOrder();
    }

    @Then("The user should be payment form screen")
    public void theUserShouldBePaymentFormScreen() {
        PaymentService.isPaymentVisible();
    }
}
