package com.crowdar.saucedemoapp.constants;

public class HomeConstants {

    public static final String HOME_TITLE = "ACCESSIBILITY_ID:title";
    public static final String PRODUCT_BUTTON_BY_TITLE = "xpath://android.widget.TextView[@text='%s']/preceding-sibling::android.widget.ImageView";
    public static final String PRODUCT_TITLE = "xpath://android.widget.TextView[@content-desc=\"Product Title\" and @text=\"%s\"]";
    public static final String MENU_BUTTON = "ACCESSIBILITY_ID:View menu";
    public static final String CATALOG_BUTTON = "xpath://android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/itemTV' and @text='Catalog']";
}
