package com.inivos.tests.mobile.base;

import com.inivos.driver.Driver;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class MobileBase {

    @BeforeMethod
    public void setUp() throws MalformedURLException, DriverAgentNotFoundException {
        Driver.initDriverForMobile();
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }
}
