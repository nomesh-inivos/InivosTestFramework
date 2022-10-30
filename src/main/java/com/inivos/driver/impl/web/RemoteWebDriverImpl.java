package com.inivos.driver;

import com.inivos.driver.entity.WebDriverData;
import com.inivos.driver.factory.web.remote.RemoteDriverFactory;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class RemoteWebDriverImpl implements IWebDriver{
    /**
     * @param driverData
     * @return
     */
    @Override
    public WebDriver getDriver(WebDriverData driverData) throws DriverAgentNotFoundException, MalformedURLException {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
    }
}
