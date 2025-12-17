package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.ShippingService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ShippingSteps {

    @And("The user completes the checkout form with default values")
    public void theClientCompletesTheShippingFormWithDefaultValues() {
        ShippingService.isShippingVisible();
        ShippingService.fillFormDefault();
        ShippingService.clickToPayment();
    }

    @When("The user completes the checkout form with {string} full name, {string} address, {string} city, {string} zip code and {string} country")
    public void theUserCompletesTheCheckoutFormWithFullNameAddressCityZipCodeAndCountry(String fullname, String address, String city, String zipcode, String country) {
        ShippingService.fillForm(fullname, address, city, zipcode, country);
        ShippingService.clickToPayment();
    }
}
