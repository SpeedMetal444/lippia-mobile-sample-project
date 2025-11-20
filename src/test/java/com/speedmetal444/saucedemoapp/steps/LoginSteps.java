package com.speedmetal444.saucedemoapp.steps;

import com.speedmetal444.saucedemoapp.services.LoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Then("The client should be on the login screen")
    public void theClientShouldBeOnTheLoginScreen() {
        LoginService.isLoginVisible();
    }

    @When("The client fills the form with the login default values")
    public void theClientFillsTheFormWithTheLoginDefaultValues() {
        LoginService.fillFormDefault();
    }

    @And("The client taps on the Login button")
    public void theClientTapsOnTheLoginButton() {
        LoginService.clickLogin();
    }
}
