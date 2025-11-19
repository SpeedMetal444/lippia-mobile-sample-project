package com.speedmetal444.saucedemoapp.services;
import com.crowdar.core.actions.MobileActionManager;
import com.speedmetal444.saucedemoapp.constants.SauceDemoProductViewConstants;
import junit.framework.Assert;

public class SauceDemoProductViewService {
    public static void isProductViewLoaded() {
        MobileActionManager.waitVisibility(SauceDemoProductViewConstants.PRODUCT_VIEW);
    }

    public static void clickAddToCart() {
        MobileActionManager.click(SauceDemoProductViewConstants.ADD_TO_CART_BUTTON);
    }

    public static void isCartBadgeCountVisible(String quantity) {
        Assert.assertTrue(MobileActionManager.isVisible(SauceDemoProductViewConstants.CART_BADGE_COUNT));
        Object actualQuantity = MobileActionManager.getText(SauceDemoProductViewConstants.CART_BADGE_COUNT);
                Assert.assertEquals(actualQuantity, quantity);
    }

    public static void clickAddItem() {
        MobileActionManager.click(SauceDemoProductViewConstants.INCREASE_QUANTITY_BUTTON);
    }
}
