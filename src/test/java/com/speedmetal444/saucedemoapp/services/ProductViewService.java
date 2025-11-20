package com.speedmetal444.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.speedmetal444.saucedemoapp.constants.ProductViewConstants;
import junit.framework.Assert;

public class ProductViewService {
    public static void isProductViewLoaded() {
        MobileActionManager.waitVisibility(ProductViewConstants.PRODUCT_VIEW);
    }

    public static void clickAddToCart() {
        MobileActionManager.click(ProductViewConstants.ADD_TO_CART_BUTTON);
    }

    public static void isCartBadgeCountVisible(String quantity) {
        Assert.assertTrue(MobileActionManager.isVisible(ProductViewConstants.CART_BADGE_COUNT));
        Object actualQuantity = MobileActionManager.getText(ProductViewConstants.CART_BADGE_COUNT);
                Assert.assertEquals(actualQuantity, quantity);
    }

    public static void clickIncreaseItem() {
        MobileActionManager.click(ProductViewConstants.INCREASE_QUANTITY_BUTTON);
    }

    public static void clickDecreaseItem() {
        MobileActionManager.click(ProductViewConstants.DECREASE_QUANTITY_BUTTON);
    }

    public static void clickCart() {
        MobileActionManager.click(ProductViewConstants.CART_BUTTON);
    }
}
