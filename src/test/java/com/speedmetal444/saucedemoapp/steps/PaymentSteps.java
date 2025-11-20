package com.speedmetal444.saucedemoapp.steps;

import com.speedmetal444.saucedemoapp.services.PaymentService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentSteps {

    @Then("The client should be on the payment form screen")
    public void theClientShouldBeOnThePaymentFormScreen() {
        PaymentService.isPaymentVisible();
    }

    @When("The client fills the form with the payment default values")
    public void theClientFillsTheFormWithThePaymentDefaultValues() {
        PaymentService.fillFormDefault();
    }

    @And("The client taps on the Review order button")
    public void theClientTapsOnTheReviewOrderButton() {
        PaymentService.clickReviewOrder();
    }
}
