package com.inivos.com.inivos.driver.manager.web;

import com.inivos.config.ConfigurationFactory;
import com.inivos.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public final class SelenoidGridChromeManager {
    public static WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(BrowserType.CHROME));
        capabilities.setCapability("browserName","Chrome");
        capabilities.setCapability("browserVersion","97.0");
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(ConfigurationFactory.getConfig().selenoidUrl(), capabilities);
    }
}
