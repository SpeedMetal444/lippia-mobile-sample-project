package com.speedmetal444.saucedemoapp.steps;

import com.speedmetal444.saucedemoapp.services.SauceDemoHomeService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoHomeSteps {
    @Given("The SauceDemo app is loaded correctly")
    public void theSauceDemoAppIsLoadedCorrectly() {
        SauceDemoHomeService.isHomeViewLoaded();
    }

    @When("The client scrolls down until the product {string} is visible")
    public void theClientScrollsDownToFindTheProduct(String productTitle) {
        SauceDemoHomeService.scrollToProduct(productTitle);
    }

    @Then("The client can see the {string} title")
    public void theClientCanSeeTheProductTitle(String title) {
        SauceDemoHomeService.validateProductTitleVisible(title);
    }

    @And("The client taps on the {string} image")
    public void theClientTapsOnTheImage(String product) {
        SauceDemoHomeService.clickProduct(product);
    }
}
