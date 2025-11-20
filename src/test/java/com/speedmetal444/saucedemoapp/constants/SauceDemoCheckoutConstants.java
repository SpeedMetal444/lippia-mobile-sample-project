package com.speedmetal444.saucedemoapp.constants;

public class SauceDemoCheckoutConstants {
    //FIRST PAGE SHIPPING INFO
    public static final String INPUT_FULL_NAME = "ID:com.saucelabs.mydemoapp.android:id/fullNameET";
    public static final String INPUT_ADDRESS_REQUIRED = "ID:com.saucelabs.mydemoapp.android:id/address1ET";
    public static final String INPUT_ADDRESS_OPTIONAL = "ID:com.saucelabs.mydemoapp.android:id/address2ET";
    public static final String INPUT_CITY = "ID:com.saucelabs.mydemoapp.android:id/cityET";
    public static final String INPUT_STATE = "ID:com.saucelabs.mydemoapp.android:id/stateET";
    public static final String INPUT_ZIPCODE = "ID:com.saucelabs.mydemoapp.android:id/zipET";
    public static final String INPUT_COUNTRY = "ID:com.saucelabs.mydemoapp.android:id/countryET";
    public static final String TO_PAYMENT_BUTTON = "ACCESSIBILITY_ID:Saves user info for checkout";

    //SECOND PAGE PAYMENT INFO
    public static final String INPUT_FULL_NAME_PAY = "ID:com.saucelabs.mydemoapp.android:id/nameET";
    public static final String INPUT_CARD_NUMBER = "ID:com.saucelabs.mydemoapp.android:id/cardNumberET";
    public static final String INPUT_EXPIRATION_DATE = "ID:com.saucelabs.mydemoapp.android:id/expirationDateET";
    public static final String INPUT_SECURITY_CODE = "ID:com.saucelabs.mydemoapp.android:id/securityCodeET";
    public static final String SAME_ADDRESS_CHECKBOX = "ACCESSIBILITY_ID:Select if User billing address and shipping address are same";
    public static final String REVIEW_ORDER_BUTTON = "ACCESSIBILITY_ID:Saves payment info and launches screen to review checkout data";
}
