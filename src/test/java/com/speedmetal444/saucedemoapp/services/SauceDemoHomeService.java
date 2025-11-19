package com.speedmetal444.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.speedmetal444.saucedemoapp.constants.SauceDemoHomeConstants;
import com.speedmetal444.saucedemoapp.utils.Utils;
import org.testng.Assert;

public class SauceDemoHomeService {
    public static void isHomeViewLoaded() {
        MobileActionManager.waitVisibility(SauceDemoHomeConstants.HOME_TITLE);
    }

    public static void scrollToProduct(String productName) {
        Utils.scrollAndroid(productName);
    }

    public static void validateProductTitleVisible(String title) {
        String locator = String.format(SauceDemoHomeConstants.PRODUCT_TITLE, title);
        MobileActionManager.waitVisibility(locator);
        Assert.assertTrue(MobileActionManager.isVisible(locator));
    }

    public static void clickProduct(String product) {
        MobileActionManager.click(SauceDemoHomeConstants.PRODUCT_BUTTON_BY_TITLE, product);
    }
}
