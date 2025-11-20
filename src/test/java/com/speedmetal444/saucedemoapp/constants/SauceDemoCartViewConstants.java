package com.speedmetal444.saucedemoapp.constants;

public class SauceDemoCartViewConstants {

    public static final String MY_CART_TITLE = "ID:com.saucelabs.mydemoapp.android:id/productTV";
    public static final String NO_ITEMS_TITLE = "ID:com.saucelabs.mydemoapp.android:id/noItemTitleTV";
    public static final String REMOVE_ITEM_BUTTON = "ACCESSIBILITY_ID:Removes product from cart";
    public static final String REMOVE_ITEM_BY_NAME_BUTTON = "xpath://android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text='%s']/preceding-sibling::android.widget.TextView[@content-desc=\"Removes product from cart\"]";
    public static final String CHECKOUT_BUTTON = "ACCESSIBILITY_ID:Confirms products for checkout";
    public static final String TOTAL_ITEMS = "ID:com.saucelabs.mydemoapp.android:id/itemsTV";
    public static final String TOTAL_PRICE = "ID:com.saucelabs.mydemoapp.android:id/totalPriceTV";

}
