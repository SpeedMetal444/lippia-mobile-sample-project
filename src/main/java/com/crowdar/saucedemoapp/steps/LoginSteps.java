package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.LoginService;
import io.cucumber.java.en.And;

public class LoginSteps {

    @And("The user logs in with the default credentials")
    public void theClientLogsInWithTheDefaultCredentials() {
        LoginService.isLoginVisible();
        LoginService.fillFormDefault();
        LoginService.clickLogin();
    }
}
