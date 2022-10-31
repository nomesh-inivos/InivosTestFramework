package com.inivos.driver.factory.mobile.remote;

import com.inivos.driver.manager.mobile.remote.BrowserStackAndroidManager;
import com.inivos.driver.manager.mobile.remote.BrowserStackIOSManager;
import com.inivos.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class BrowserStackMobileFactory {

    public BrowserStackMobileFactory() {
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) throws MalformedURLException {
        WebDriver driver = null;
        if(mobilePlatformType == MobilePlatformType.ANDROID) {
            driver= BrowserStackAndroidManager.getDriver();
        }else if (mobilePlatformType == MobilePlatformType.IOS) {
            driver = BrowserStackIOSManager.getDriver();
        }
        return driver;
    }

}
