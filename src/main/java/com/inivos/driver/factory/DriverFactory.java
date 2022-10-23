package com.inivos.driver.factory;

import com.inivos.driver.LocalMobileDriverImpl;
import com.inivos.driver.LocalWebDriverImpl;
import com.inivos.driver.RemoteMobileDriverImpl;
import com.inivos.driver.RemoteWebDriverImpl;
import com.inivos.driver.entity.MobileDriverData;
import com.inivos.driver.entity.WebDriverData;
import com.inivos.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.inivos.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.inivos.driver.factory.web.local.LocalDriverFactory;
import com.inivos.driver.factory.web.remote.RemoteDriverFactory;
import com.inivos.enums.RunModeType;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

import static com.inivos.enums.RunModeType.LOCAL;

public final class DriverFactory {
    private DriverFactory() {}

    /**
     * Returns the Web Driver Based on the RunModeType (REMOTE or LOCAL)
     * @param webDriverData
     * @return
     * @throws DriverAgentNotFoundException
     * @throws MalformedURLException
     */
    public static WebDriver getDriverForWeb(WebDriverData webDriverData) throws DriverAgentNotFoundException, MalformedURLException {
        return (webDriverData.getRunModeType() == LOCAL)
            ? new LocalWebDriverImpl().getDriver(webDriverData)
            : new RemoteWebDriverImpl().getDriver(webDriverData);
    }

    /**
     * Returns the Mobile Driver Based on the RunModeType (REMOTE or LOCAL)
     * @param mobileDriverData
     * @return
     * @throws MalformedURLException
     * @throws DriverAgentNotFoundException
     */
    public static WebDriver getDriverForMobile(MobileDriverData mobileDriverData) throws MalformedURLException, DriverAgentNotFoundException {
        return (mobileDriverData.getRunModeType() == LOCAL)
                ? new LocalMobileDriverImpl().getDriver(mobileDriverData)
                : new RemoteMobileDriverImpl().getDriver(mobileDriverData);
    }

}
