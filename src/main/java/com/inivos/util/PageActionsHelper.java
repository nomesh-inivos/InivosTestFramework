package com.inivos.util;

import com.inivos.driver.DriverManager;
import org.openqa.selenium.By;

public class PageActionsHelper {

    private  PageActionsHelper(){}

    public static void waitAndClick(By by) {
        DriverManager.getDriver().findElement(by).click();
    }
    public static void waitAndSendKeys(By by, String value) {
        DriverManager.getDriver().findElement(by).sendKeys(value);
    }


}
