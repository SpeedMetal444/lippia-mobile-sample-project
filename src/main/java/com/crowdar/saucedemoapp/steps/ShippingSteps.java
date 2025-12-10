package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.ShippingService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShippingSteps {

    @And("The client completes the shipping form with default values")
    public void theClientCompletesTheShippingFormWithDefaultValues() {
        ShippingService.isShippingVisible();
        ShippingService.fillFormDefault();
        ShippingService.clickToPayment();
    }
}
