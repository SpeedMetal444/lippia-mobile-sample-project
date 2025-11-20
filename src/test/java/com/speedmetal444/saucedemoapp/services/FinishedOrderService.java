package com.speedmetal444.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.speedmetal444.saucedemoapp.constants.FinishedOrderViewConstants;
import junit.framework.Assert;

public class FinishedOrderService {

    public static void isFinishedOrderVisible() {
        MobileActionManager.waitVisibility(FinishedOrderViewConstants.CHECKOUT_COMPLETE_MESSAGE);
        Assert.assertTrue(MobileActionManager.isVisible(FinishedOrderViewConstants.THANKS_MESSAGE));
    }
}