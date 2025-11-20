package com.speedmetal444.saucedemoapp.steps;

import com.speedmetal444.saucedemoapp.services.ShippingService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShippingSteps {

    @Then("The client should be on the shipping form screen")
    public void theClientShouldBeOnTheShippingFormScreen() {
        ShippingService.isShippingVisible();
    }

    @When("The client fills the form with the shipping default values")
    public void theClientFillsTheFormWithTheShippingDefaultValues() {
        ShippingService.fillFormDefault();
    }

    @And("The client taps on the To payment button")
    public void theClientTapsOnTheToPaymentButton() {
        ShippingService.clickToPayment();
    }
}
