package com.inivos.com.inivos.driver;

import com.inivos.com.inivos.driver.manager.BrowserStackChromeManager;
import com.inivos.com.inivos.driver.manager.BrowserStackFirefoxManager;
import com.inivos.com.inivos.driver.manager.SeleniumGridChromeManager;
import com.inivos.com.inivos.driver.manager.SeleniumGridFirefoxManager;
import com.inivos.config.BrowserStackConfigfactory;
import com.inivos.config.ConfigurationFactory;
import com.inivos.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
