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


public final class Driver {

    private Driver() {}

    /**
     * Initialising the Web Driver.
     * @throws MalformedURLException
     * @throws DriverAgentNotFoundException
     */
    public static void initDriverForWeb() throws MalformedURLException, DriverAgentNotFoundException {
        if(Objects.isNull(DriverManager.getDriver())){
            WebDriverData driverData = WebDriverData.builder()
                    .browserType(ConfigurationFactory.getConfig().browser())
                    .browserRemoteModeType(ConfigurationFactory.getConfig().browserRemoteMode())
                    .build();

            WebDriver driver = DriverFactory.getDriverForWeb(ConfigurationFactory.getConfig().browserRunMode())
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
                .mobileRemoteModeType(ConfigurationFactory.getConfig().mobileRemoteMode())
                .build();
        WebDriver driver = DriverFactory.getDriverForMobile(ConfigurationFactory.getConfig().mobileRunMode())
                        .getDriver(driverData);

        DriverManager.setDriver(driver);
    }

    public static void loadUrl() {
        DriverManager.getDriver().get(ConfigurationFactory.getConfig().webUrl());
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
