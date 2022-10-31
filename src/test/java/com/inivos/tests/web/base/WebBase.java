package com.inivos.tests.web.base;

import com.inivos.driver.Driver;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class WebBase {

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws MalformedURLException, DriverAgentNotFoundException {
        Driver.initDriverForWeb();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        Driver.quitDriver();
    }
}