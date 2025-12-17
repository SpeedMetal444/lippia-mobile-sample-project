package com.crowdar.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.saucedemoapp.constants.PaymentFormViewConstants;

import static com.crowdar.saucedemoapp.services.UtilsService.fillWithHint;

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

    public static void fillForm(String fullname, String card, String expdate, String code) {
        MobileActionManager.setInput(PaymentFormViewConstants.INPUT_FULL_NAME_PAY, fullname);
        MobileActionManager.setInput(PaymentFormViewConstants.INPUT_CARD_NUMBER, card);
        MobileActionManager.setInput(PaymentFormViewConstants.INPUT_EXPIRATION_DATE, expdate);
        MobileActionManager.setInput(PaymentFormViewConstants.INPUT_SECURITY_CODE, code);
    }
}
