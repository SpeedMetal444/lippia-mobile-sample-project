package com.crowdar.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.saucedemoapp.constants.ProductViewConstants;
import junit.framework.Assert;

public class ProductViewService {
    public static void isProductViewVisible() {
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

    public static void clickIncreaseItemNTimes(int times) {
        for (int i = 0; i < times; i++) {
            ProductViewService.clickIncreaseItem();
        }
    }

    public static void clickDecreaseItem() {
        MobileActionManager.click(ProductViewConstants.DECREASE_QUANTITY_BUTTON);
    }

    public static void clickCart() {
        MobileActionManager.click(ProductViewConstants.CART_BUTTON);
    }

    public static void selectRating(int star) {
        if (star < 1 || star > 5) {
            throw new IllegalArgumentException("Star rating must be between 1 and 5");
        }

        String locator = String.format(ProductViewConstants.ITEM_RATING, star);
        MobileActionManager.click(locator);
    }

    public static void isRatingThanksMessageVisible() {
        MobileActionManager.isVisible(ProductViewConstants.RATING_THANKS_MESSAGE);
    }
}
