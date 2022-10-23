package com.inivos.driver;

import com.inivos.driver.entity.MobileDriverData;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;

public interface IMobileDriver {

    WebDriver getDriver(MobileDriverData driverData) throws DriverAgentNotFoundException, MalformedURLException;
}
