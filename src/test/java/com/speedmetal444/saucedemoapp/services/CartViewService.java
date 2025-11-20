package com.speedmetal444.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.speedmetal444.saucedemoapp.constants.CartViewConstants;
import org.testng.Assert;

public class CartViewService {

    public static void isCartViewLoaded() {
        MobileActionManager.waitVisibility(CartViewConstants.MY_CART_TITLE);
    }

    public static void clickRemove() {
        MobileActionManager.click(CartViewConstants.REMOVE_ITEM_BUTTON);
    }

    public static void isNoItemDisplayed() {
        MobileActionManager.waitVisibility(CartViewConstants.NO_ITEMS_TITLE);
        Assert.assertTrue(MobileActionManager.isVisible(CartViewConstants.NO_ITEMS_TITLE));
    }

    public static void clickProceedToCheckout() {
        MobileActionManager.click(CartViewConstants.CHECKOUT_BUTTON);
    }
}