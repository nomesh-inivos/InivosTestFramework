package com.inivos.driver.factory.web.remote;

import com.inivos.enums.BrowserRemoteModeType;
import com.inivos.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

/**
 * This class is specifically used to work on remote setup and with Selenoid, Selenium, Browser stack etc.
 */
public final class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) throws MalformedURLException {
        WebDriver driver = null;

        if (isSelenium(browserRemoteModeType)) {
            driver = SeleniumGridFactory.getDriver(browserType);
        } else if (isSelenoid(browserRemoteModeType)) {
            driver =  SelenoidGridFactory.getDriver(browserType);
        }else if (isBrowserStack(browserRemoteModeType)) {
            driver =  BrowserStackFactory.getDriver(browserType);
        }
        return driver;
    }

    private static boolean isSelenium(BrowserRemoteModeType browserRemoteModeType) {
        return browserRemoteModeType.toString().toUpperCase().equals(BrowserRemoteModeType.SELENIUM);
    }

    private static boolean isSelenoid(BrowserRemoteModeType browserRemoteModeType) {
        return browserRemoteModeType.toString().toUpperCase().equals(BrowserRemoteModeType.SELENOID);
    }
    private static boolean isBrowserStack(BrowserRemoteModeType browserRemoteModeType) {
        return browserRemoteModeType.toString().toUpperCase().equals(BrowserRemoteModeType.BROWSER_STACK);
    }



}
