package com.inivos.com.inivos.driver.factory.web.remote;

import com.inivos.com.inivos.driver.manager.web.SeleniumGridFirefoxManager;
import com.inivos.com.inivos.driver.manager.web.SelenoidGridChromeManager;
import com.inivos.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class SelenoidGridFactory {
    public static WebDriver getDriver(BrowserType browserType) throws MalformedURLException {
        WebDriver driver = null;
        if(browserType == BrowserType.CHROME) {
            driver= SelenoidGridChromeManager.getDriver();
        }else if (browserType == BrowserType.FIREFOX) {
            driver = SeleniumGridFirefoxManager.getDriver();
        }
        return driver;
    }
}
