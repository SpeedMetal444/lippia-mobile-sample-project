package com.crowdar.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.saucedemoapp.constants.HomeConstants;
import com.crowdar.saucedemoapp.utils.Utils;
import org.testng.Assert;

public class HomeService {
    public static void isHomeViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.HOME_TITLE);
    }

    public static void scrollToProduct(String productName) {
        Utils.scrollAndroid(productName);
    }

    public static void validateProductTitleVisible(String title) {
        String locator = String.format(HomeConstants.PRODUCT_TITLE, title);
        MobileActionManager.waitVisibility(locator);
        Assert.assertTrue(MobileActionManager.isVisible(locator));
    }

    public static void clickProduct(String product) {
        MobileActionManager.click(HomeConstants.PRODUCT_BUTTON_BY_TITLE, product);
    }
}
