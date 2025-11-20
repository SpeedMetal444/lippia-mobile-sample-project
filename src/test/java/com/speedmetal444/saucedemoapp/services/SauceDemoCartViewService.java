package com.speedmetal444.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.speedmetal444.saucedemoapp.constants.SauceDemoCartViewConstants;
import com.speedmetal444.saucedemoapp.utils.Utils;
import org.testng.Assert;

public class SauceDemoCartViewService {

    public static void isCartViewLoaded() {
        MobileActionManager.waitVisibility(SauceDemoCartViewConstants.MY_CART_TITLE);
    }

    public static void clickRemove() {
        MobileActionManager.click(SauceDemoCartViewConstants.REMOVE_ITEM_BUTTON);
    }

    public static void isNoItemDisplayed() {
        MobileActionManager.waitVisibility(SauceDemoCartViewConstants.NO_ITEMS_TITLE);
        Assert.assertTrue(MobileActionManager.isVisible(SauceDemoCartViewConstants.NO_ITEMS_TITLE));
    }

    public static void clickProceedToCheckout() {
        MobileActionManager.click(SauceDemoCartViewConstants.CHECKOUT_BUTTON);
    }

}