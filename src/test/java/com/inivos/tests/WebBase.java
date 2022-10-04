package com.inivos.tests;

import com.inivos.driver.Driver;
import com.inivos.exceptions.DriverAgentNotFoundException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

import static com.inivos.driver.Driver.initDriver;


public class WebBase {
    @BeforeMethod
    public void setUp() {
        Driver.initDriver();
    }
}
