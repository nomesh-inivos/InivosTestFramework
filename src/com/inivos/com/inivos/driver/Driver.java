package com.inivos.com.inivos.driver;

import com.inivos.com.inivos.exceptions.DriverAgentNotFoundException;
import com.inivos.config.ConfigurationFactory;
import com.inivos.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public class Driver {
    /**
     * initializing the Web Agent Driver: ex: CHROME, FIREFOX
     */
    public static void initDriver() throws DriverAgentNotFoundException {
        WebDriver driver = LocalDriverFactory.getDriver(ConfigurationFactory.getConfig().browser());
        driver.get("htts://google.co.uk");
    }

    /**
     * closing the initialized Web Agent Driver: ex: CHROME, FIREFOX
     */
    public static void quitDriver(){

    }
}
