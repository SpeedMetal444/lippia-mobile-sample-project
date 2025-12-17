package com.crowdar.saucedemoapp.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.saucedemoapp.constants.ShippingFormViewConstants;

import static com.crowdar.saucedemoapp.services.UtilsService.fillWithHint;

public class ShippingService {

    public static void isShippingVisible() {
        MobileActionManager.waitVisibility(ShippingFormViewConstants.TO_PAYMENT_BUTTON);
    }

    public static void fillFormDefault() {
        fillWithHint(ShippingFormViewConstants.INPUT_FULL_NAME);
        fillWithHint(ShippingFormViewConstants.INPUT_ADDRESS_REQUIRED);
        fillWithHint(ShippingFormViewConstants.INPUT_CITY);
        fillWithHint(ShippingFormViewConstants.INPUT_ZIPCODE);
        fillWithHint(ShippingFormViewConstants.INPUT_COUNTRY);
    }

    public static void fillForm(String fullname, String address, String city, String zipcode, String country) {
        MobileActionManager.setInput(ShippingFormViewConstants.INPUT_FULL_NAME, fullname);
        MobileActionManager.setInput(ShippingFormViewConstants.INPUT_ADDRESS_REQUIRED, address);
        MobileActionManager.setInput(ShippingFormViewConstants.INPUT_CITY, city);
        MobileActionManager.setInput(ShippingFormViewConstants.INPUT_ZIPCODE, zipcode);
        MobileActionManager.setInput(ShippingFormViewConstants.INPUT_COUNTRY, country);
    }

    public static void clickToPayment() {
        MobileActionManager.click(ShippingFormViewConstants.TO_PAYMENT_BUTTON);
    }
}
