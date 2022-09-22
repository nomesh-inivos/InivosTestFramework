package com.inivos.com.inivos.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class SeleniumGridChromeManager {
    private SeleniumGridChromeManager(){}

    public static WebDriver getDriver(){
        return new ChromeDriver().get
    }
}
