package com.inivos.driver;

import com.inivos.driver.entity.WebDriverData;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface IWebDriver {

    WebDriver getDriver(WebDriverData driverData) throws DriverAgentNotFoundException, MalformedURLException;

}
