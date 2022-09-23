package com.inivos.com.inivos.driver.manager.web;

import com.inivos.config.ConfigurationFactory;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

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
