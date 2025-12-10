package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.LoginService;
import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @And("The client logs in with the default credentials")
    public void theClientLogsInWithTheDefaultCredentials() {
        LoginService.isLoginVisible();
        LoginService.fillFormDefault();
        LoginService.clickLogin();
    }
}
