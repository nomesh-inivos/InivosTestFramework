package com.inivos.com.inivos.driver;

import com.inivos.config.ConfigurationFactory;
import com.inivos.enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;

/**
 * This class is specifically used to work on remote setup and with Selenoid, Selenium, Browser stack etc.
 */
public final class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    public static WebDriver getDriver() {
        WebDriver driver = null;

        if (isSelenium(BrowserRemoteModeType.SELENIUM)) {

        } else if (isSelenoid(BrowserRemoteModeType.SELENOID)) {

        }
        return driver;
    }

    private static boolean isSelenium(BrowserRemoteModeType selenium) {
        return ConfigurationFactory.getConfig().browserRemoteMode().equals(selenium);
    }

    private static boolean isSelenoid(BrowserRemoteModeType selenoid) {
        return ConfigurationFactory.getConfig().browserRemoteMode().equals(selenoid);
    }


}
