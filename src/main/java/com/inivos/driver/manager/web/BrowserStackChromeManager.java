package com.inivos.driver.manager.impl.web;

import com.inivos.config.BrowserStackConfigfactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class BrowserStackChromeManager {

    private BrowserStackChromeManager(){}

    public static WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName","Chrome");
        capabilities.setCapability("browser_version","latest");
        capabilities.setCapability("os","Windows");
        capabilities.setCapability("os_version","10");

        return new RemoteWebDriver(BrowserStackConfigfactory.getConfig().browserStackUrl(), capabilities);
    }
}
