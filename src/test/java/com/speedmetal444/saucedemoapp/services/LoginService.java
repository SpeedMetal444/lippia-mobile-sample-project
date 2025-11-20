package com.speedmetal444.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.speedmetal444.saucedemoapp.constants.LoginViewConstants;

import static com.speedmetal444.saucedemoapp.utils.Utils.fillWithText;

public class LoginService {

    public static void isLoginVisible() {
        MobileActionManager.waitVisibility(LoginViewConstants.LOGIN_BUTTON);
    }

    public static void fillFormDefault() {
        fillWithText(LoginViewConstants.USERNAME_NORMAL, LoginViewConstants.INPUT_USER);
        fillWithText(LoginViewConstants.PASSWORD,LoginViewConstants.INPUT_PASSWORD);
    }

    public static void clickLogin() {
        MobileActionManager.click(LoginViewConstants.LOGIN_BUTTON);
    }
}