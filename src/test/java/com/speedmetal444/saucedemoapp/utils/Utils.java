package com.speedmetal444.saucedemoapp.utils;

import com.crowdar.driver.DriverManager;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;

public class Utils {

    public static WebElement scrollAndroid(String text) {
        String uiSelector = String.format(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"%s\"))",
                text
        );

        return DriverManager.getDriverInstance()
                .findElement(MobileBy.AndroidUIAutomator(uiSelector));
    }


    public static String desencriptarEnv(String key) {
        String value = System.getenv(key);
        if (value == null) {
            throw new RuntimeException("No se encontró la variable de entorno: " + key);
        }
        return value;
    }

}
