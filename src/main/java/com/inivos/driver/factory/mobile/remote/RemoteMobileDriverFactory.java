package com.inivos.driver.factory.mobile.remote;

import com.inivos.driver.manager.mobile.local.AndroidManager;
import com.inivos.driver.manager.mobile.local.IosManager;
import com.inivos.enums.MobilePlatformType;
import com.inivos.enums.MobileRemoteModeType;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory(){}
    /**
     * Returns the correct Web agent driver.
     * @return remote WebDriver instance.
     * @throws DriverAgentNotFoundException when the suitable driver is not found.
     */

    public static WebDriver getDriver(MobileRemoteModeType mobileRemoteMethodType, MobilePlatformType mobilePlatformType) throws DriverAgentNotFoundException, MalformedURLException {
        WebDriver driver = null;
        if (isMobileRemoteBrowserStackMode(mobileRemoteMethodType)) {
            driver = AndroidManager.getDriver();
        } else if(isMobileRemoteSauceLabsMode(mobileRemoteMethodType)) {
            driver = IosManager.getDriver();
        }
        return driver;
    }

    private static boolean isMobileRemoteBrowserStackMode(MobileRemoteModeType mobileRemoteMethodType) {
        return mobileRemoteMethodType == MobileRemoteModeType.BROWSER_STACK;
    }

    private static boolean isMobileRemoteSauceLabsMode(MobileRemoteModeType mobileRemoteMethodType) {
        return mobileRemoteMethodType == MobileRemoteModeType.SAUCE_LABS;
    }
}
