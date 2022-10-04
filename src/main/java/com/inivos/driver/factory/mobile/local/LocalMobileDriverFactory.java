package com.inivos.driver.factory.mobile.local;

import com.inivos.driver.manager.mobile.local.AndroidManager;
import com.inivos.driver.manager.mobile.local.IosManager;
import com.inivos.enums.MobilePlatformType;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

/**
 * This class is specifically used to work on local browser setup like Firefox and Chrome.
 */
public final class LocalMobileDriverFactory {

    private LocalMobileDriverFactory() {
    }

    /**
     * Returns the correct Web agent driver.
     *
     * @return remote WebDriver instance.
     * @throws DriverAgentNotFoundException when the suitable driver is not found.
     */

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        WebDriver driver = null;
        if (isMobileAndroid(mobilePlatformType)) {
            driver = AndroidManager.getDriver();
        } else if(isMobileIOS(mobilePlatformType)) {
            try {
                driver = IosManager.getDriver();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return driver;
    }

    private static boolean isMobileAndroid(MobilePlatformType mobilePlatformType) {
        return mobilePlatformType == mobilePlatformType.ANDROID;
    }

    private static boolean isMobileIOS(MobilePlatformType mobilePlatformType) {
        return mobilePlatformType == mobilePlatformType.IOS;
    }

}
