package com.inivos.driver;

import com.inivos.driver.entity.MobileDriverData;
import com.inivos.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class RemoteMobileDriverImpl implements IMobileDriver{

    /**
     * @param driverData
     * @return
     * @throws DriverAgentNotFoundException
     * @throws MalformedURLException
     */
    @Override
    public WebDriver getDriver(MobileDriverData driverData) throws DriverAgentNotFoundException, MalformedURLException {
        return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(),
                driverData.getMobilePlatformType());
    }
}
