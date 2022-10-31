package com.inivos.driver;

import com.inivos.config.ConfigurationFactory;
import com.inivos.driver.entity.MobileDriverData;
import com.inivos.driver.entity.WebDriverData;
import com.inivos.driver.factory.DriverFactory;
import com.inivos.enums.MobilePlatformType;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.Objects;

import static com.inivos.config.ConfigurationFactory.getConfig;


public final class Driver {

    private Driver() {}

    /**
     * Initialising the Web Driver.
     * @throws MalformedURLException
     * @throws DriverAgentNotFoundException
     */
    public static void initDriverForWeb() throws MalformedURLException, DriverAgentNotFoundException {
        if(Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
            WebDriver driver = DriverFactory
                    .getDriverForWeb(getConfig().browserRunMode())
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
            loadUrl();
        }
    }

    /**
     * Initialising the Mobile Driver.
     * @throws MalformedURLException
     * @throws DriverAgentNotFoundException
     */
    public static void initDriverForMobile() throws MalformedURLException, DriverAgentNotFoundException {
        MobileDriverData driverData = MobileDriverData.builder()
                .mobilePlatformType(MobilePlatformType.ANDROID)
                .mobileRemoteModeType(getConfig().mobileRemoteMode())
                .build();
        WebDriver driver = DriverFactory.getDriverForMobile(getConfig().mobileRunMode())
                        .getDriver(driverData);

        DriverManager.setDriver(driver);
    }

    public static void loadUrl() {
        DriverManager.getDriver().get(getConfig().webUrl());
    }

    /**
     * closing the initialized Web Agent Driver: ex: CHROME, FIREFOX
     */
    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
