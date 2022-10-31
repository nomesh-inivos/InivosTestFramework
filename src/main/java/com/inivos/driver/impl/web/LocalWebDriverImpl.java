package com.inivos.driver.impl.web;

import com.inivos.driver.IWebDriver;
import com.inivos.driver.entity.WebDriverData;
import com.inivos.driver.factory.web.local.LocalDriverFactory;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {
    /**
     * @param driverData
     * @return
     */
    @Override
    public WebDriver getDriver(WebDriverData driverData) throws DriverAgentNotFoundException {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}
