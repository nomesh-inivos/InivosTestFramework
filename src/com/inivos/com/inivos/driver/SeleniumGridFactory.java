package com.inivos.com.inivos.driver;

import com.inivos.com.inivos.driver.manager.SeleniumGridChromeManager;
import com.inivos.com.inivos.driver.manager.SeleniumGridFirefoxManager;
import com.inivos.enums.BrowserType;
import org.apache.groovy.parser.antlr4.GroovyParser;
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
