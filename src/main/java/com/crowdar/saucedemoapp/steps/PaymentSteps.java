package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.PaymentService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentSteps {

    @And("The client completes the payment form with default values")
    public void theClientCompletesThePaymentFormWithDefaultValues() {
        PaymentService.isPaymentVisible();
        PaymentService.fillFormDefault();
        PaymentService.clickReviewOrder();
    }
}
