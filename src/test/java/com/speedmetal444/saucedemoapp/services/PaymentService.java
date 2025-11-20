package com.speedmetal444.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.speedmetal444.saucedemoapp.constants.PaymentFormViewConstants;

import static com.speedmetal444.saucedemoapp.utils.Utils.fillWithHint;

public class PaymentService {

    public static void isPaymentVisible() {
        MobileActionManager.waitVisibility(PaymentFormViewConstants.REVIEW_ORDER_BUTTON);
    }

    public static void fillFormDefault() {
        fillWithHint(PaymentFormViewConstants.INPUT_FULL_NAME_PAY);
        fillWithHint(PaymentFormViewConstants.INPUT_CARD_NUMBER);
        fillWithHint(PaymentFormViewConstants.INPUT_EXPIRATION_DATE);
        fillWithHint(PaymentFormViewConstants.INPUT_SECURITY_CODE);
    }

    public static void clickReviewOrder() {
        MobileActionManager.click(PaymentFormViewConstants.REVIEW_ORDER_BUTTON);
    }
}
