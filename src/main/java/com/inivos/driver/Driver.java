package com.inivos.driver;

import com.inivos.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.inivos.driver.factory.web.local.LocalDriverFactory;
import com.inivos.enums.MobilePlatformType;
import com.inivos.exceptions.DriverAgentNotFoundException;
import com.inivos.config.ConfigurationFactory;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class Driver {

    private Driver() {}


     /**
     * initializing the Web Agent Driver:
      *     local web, remote web,
      *     local mobile, remote mobile
     */
    public static void initDriver() {
//        WebDriver driver = LocalDriverFactory.getDriver(ConfigurationFactory.getConfig().browser());
//        driver.get("htts://google.co.uk");
        //driver.quit();

        WebDriver local_mobile_driver = LocalMobileDriverFactory.getDriver(MobilePlatformType.ANDROID);
        local_mobile_driver.get("http://www.yahoo.com");


    }

    /**
     * closing the initialized Web Agent Driver: ex: CHROME, FIREFOX
     */
    public static void quitDriver(){

    }
}
