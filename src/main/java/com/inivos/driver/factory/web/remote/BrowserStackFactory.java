package com.inivos.driver.factory.web.remote;

import com.inivos.driver.manager.web.BrowserStackChromeManager;
import com.inivos.driver.manager.web.BrowserStackFirefoxManager;
import com.inivos.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class BrowserStackFactory {
    public static WebDriver getDriver(BrowserType browserType) throws MalformedURLException {
        WebDriver driver = null;
        if(browserType == BrowserType.CHROME) {
            driver= BrowserStackChromeManager.getDriver();
        }else if (browserType == BrowserType.FIREFOX) {
            driver = BrowserStackFirefoxManager.getDriver();
        }
        return driver;
    }

}
