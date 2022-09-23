package com.inivos.driver.factory.web.remote;

import com.inivos.driver.manager.web.SeleniumGridChromeManager;
import com.inivos.driver.manager.web.SeleniumGridFirefoxManager;
import com.inivos.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class SeleniumGridFactory {
    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType) throws MalformedURLException {
        WebDriver driver = null;
        if(browserType == BrowserType.CHROME) {
           driver= SeleniumGridChromeManager.getDriver();
        }else if (browserType == BrowserType.FIREFOX) {
            driver = SeleniumGridFirefoxManager.getDriver();
        }
        return driver;
    }
}
