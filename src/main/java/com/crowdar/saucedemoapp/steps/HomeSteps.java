package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.HomeService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    @Given("The SauceDemo app is loaded correctly")
    public void theSauceDemoAppIsLoadedCorrectly() {
        HomeService.isHomeViewLoaded();
    }

    @When("The client selects the product {string}")
    public void theClientSelectsTheProduct(String product) {
        HomeService.scrollToProduct(product);
        HomeService.clickProduct(product);
    }

    @When("The client scrolls down until the product {string} is visible")
    public void theClientScrollsDownUntilTheProductIsVisible(String product) {
        HomeService.scrollToProduct(product);;
    }

    @Then("The client can see the {string} title")
    public void theClientCanSeeTheTitle(String product) {
        HomeService.validateProductTitleVisible(product);
    }
}
