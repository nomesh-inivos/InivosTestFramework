package com.inivos.com.inivos.driver.manager;

import com.inivos.config.ConfigurationFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class SeleniumGridFirefoxManager {

    private SeleniumGridFirefoxManager(){}
    public static WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.FIREFOX);
        return new RemoteWebDriver(ConfigurationFactory.getConfig().seleniumGridUrl(),capabilities);
    }
}
