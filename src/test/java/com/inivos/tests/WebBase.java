package com.inivos.tests;

import com.inivos.driver.Driver;
import com.inivos.exceptions.DriverAgentNotFoundException;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;


public class WebBase {
    @BeforeMethod
    public void setUp() throws MalformedURLException, DriverAgentNotFoundException {
        Driver.initDriverForWeb();
    }
}
