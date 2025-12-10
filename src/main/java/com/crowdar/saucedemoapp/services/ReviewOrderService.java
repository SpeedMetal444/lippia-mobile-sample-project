package com.crowdar.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.saucedemoapp.constants.ReviewOrderViewConstants;

public class ReviewOrderService {

    public static void isReviewVisible() {
        MobileActionManager.waitVisibility(ReviewOrderViewConstants.PLACE_ORDER_BUTTON);
    }

    public static void clickPlaceOrder() {
        MobileActionManager.click(ReviewOrderViewConstants.PLACE_ORDER_BUTTON);
    }
}
