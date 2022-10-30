package com.inivos.driver.manager.impl.web;

import com.inivos.config.ConfigurationFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

import com.inivos.enums.BrowserType;

public final class SeleniumGridChromeManager {
    private SeleniumGridChromeManager() {
    }

    public static WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(BrowserType.CHROME));
        return new RemoteWebDriver(ConfigurationFactory.getConfig().seleniumGridUrl(), capabilities);
    }

}
