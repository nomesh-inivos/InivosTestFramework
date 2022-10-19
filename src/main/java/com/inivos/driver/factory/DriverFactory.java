package com.inivos.driver.factory;

import com.inivos.driver.entity.DriverData;
import com.inivos.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.inivos.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.inivos.driver.factory.web.local.LocalDriverFactory;
import com.inivos.driver.factory.web.remote.RemoteDriverFactory;
import com.inivos.enums.MobileRemoteModeType;
import com.inivos.enums.RunModeType;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

import static com.inivos.enums.RunModeType.LOCAL;

public final class DriverFactory {
    private DriverFactory() {}

    public static WebDriver getDriverForWeb(DriverData driverData) throws DriverAgentNotFoundException, MalformedURLException {
        if(driverData.getRunModeType() == LOCAL){
            return LocalDriverFactory.getDriver(driverData.getBrowserType());
        }else {
            return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
        }
    }

    /**
     * Returns the Mobile Web Driver Based on the RunModeType (REMOTE or LOCAL)
     * @param driverData
     * @return
     * @throws MalformedURLException
     * @throws DriverAgentNotFoundException
     */
    public static WebDriver getDriverForMobile(DriverData driverData) throws MalformedURLException, DriverAgentNotFoundException {
        if(driverData.getRunModeType() == LOCAL){
            return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
        }else {
            return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(),
                    driverData.getMobilePlatformType());
        }
    }

}
