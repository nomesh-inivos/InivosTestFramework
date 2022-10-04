package com.inivos.tests;

import com.inivos.config.AndroidConfigFactory;
import com.inivos.exceptions.DriverAgentNotFoundException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DemoTest extends WebBase {

    private WebDriver driver;

    @Before
    public void initiate() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", 10);
        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appium:automationName", "Appium");
        desiredCapabilities.setCapability("appium:app", "~/Downloads/Findlocal_debug.apk");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
//        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
//        driver.get("http://www.google.com");
//        driver.findElement(By.id("btnStartApp")).click();

    }

    @Test
    public void loginTest() throws InterruptedException {

        Thread.sleep(1000);

        {
            System.out.println("Driver" + driver);
            String app_package_name = "sample/id";
            By userId = By.id(app_package_name + "username");
            By password = By.id(app_package_name + "password");

            driver.findElement(userId).sendKeys("***********************");
            driver.findElement(password).sendKeys("****************");
            //driver.findElement(login_Button).click();

        }
    }

    // @After
    public void tearDown() {
        driver.quit();
    }
}
