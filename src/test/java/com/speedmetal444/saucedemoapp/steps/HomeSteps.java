package com.speedmetal444.saucedemoapp.steps;

import com.speedmetal444.saucedemoapp.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    @Given("The SauceDemo app is loaded correctly")
    public void theSauceDemoAppIsLoadedCorrectly() {
        HomeService.isHomeViewLoaded();
    }

    @When("The client scrolls down until the product {string} is visible")
    public void theClientScrollsDownToFindTheProduct(String productTitle) {
        HomeService.scrollToProduct(productTitle);
    }

    @Then("The client can see the {string} title")
    public void theClientCanSeeTheProductTitle(String title) {
        HomeService.validateProductTitleVisible(title);
    }

    @And("The client taps on the {string} image")
    public void theClientTapsOnTheImage(String product) {
        HomeService.clickProduct(product);
    }
}
