package com.inivos.com.inivos.driver.manager.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeManager {
    /**
     *
     * @return
     */
    public static ChromeDriver getChromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
