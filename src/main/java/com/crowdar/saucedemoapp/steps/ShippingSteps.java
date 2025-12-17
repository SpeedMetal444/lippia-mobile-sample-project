package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.ShippingService;
import io.cucumber.java.en.And;

public class ShippingSteps {

    @And("The user completes the shipping form with default values")
    public void theClientCompletesTheShippingFormWithDefaultValues() {
        ShippingService.isShippingVisible();
        ShippingService.fillFormDefault();
        ShippingService.clickToPayment();
    }
}
