package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.PaymentService;
import io.cucumber.java.en.And;

public class PaymentSteps {

    @And("The user completes the payment form with default values")
    public void theClientCompletesThePaymentFormWithDefaultValues() {
        PaymentService.isPaymentVisible();
        PaymentService.fillFormDefault();
        PaymentService.clickReviewOrder();
    }
}
