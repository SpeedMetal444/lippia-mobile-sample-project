package com.speedmetal444.saucedemoapp.utils;

import com.crowdar.driver.DriverManager;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;

public class Utils {

    public static WebElement scrollAndroid(String locatorType, String locatorValue, int index) {
        String locator = String.format("new UiScrollable(new UiSelector().scrollable(true).instance(3)).scrollIntoView(new UiSelector().%s(\"%s\").instance(0).index(%d))", locatorType, locatorValue, index);
        return DriverManager.getDriverInstance().findElement(MobileBy.AndroidUIAutomator(locator));
    }

    public static String desencriptarEnv(String key) {
        String value = System.getenv(key);
        if (value == null) {
            throw new RuntimeException("No se encontró la variable de entorno: " + key);
        }
        return value;
    }

}
