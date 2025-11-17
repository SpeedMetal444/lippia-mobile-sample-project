package com.speedmetal444.saucedemoapp.steps;

import com.speedmetal444.saucedemoapp.services.SauceDemoHomeService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoHomeSteps {
    @Given("The SauceDemo app is loaded correctly")
    public void theSauceDemoAppIsLoadedCorrectly() {
        SauceDemoHomeService.isViewLoaded();
    }

    @When("The client scrolls down to find the product {string}")
    public void theClientScrollsDownToFindTheProduct(String productTitle) {
        SauceDemoHomeService.scrollToProduct(productTitle);
    }

    @Then("The client can see the {string} title")
    public void theClientCanSeeTheProductTitle(String title) {
        SauceDemoHomeService.validateProductTitleVisible(title);
    }
}
