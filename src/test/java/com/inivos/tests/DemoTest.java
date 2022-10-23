package com.inivos.tests;

import com.inivos.tests.web.base.WebBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class DemoTest extends WebBase {

    private AndroidDriver<AndroidElement> driver = null;

    @BeforeEach
    public void initiate() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", 10);
        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");


        desiredCapabilities.setCapability("appium:app-package", "com.android.calculator2");
        desiredCapabilities.setCapability("appium:app-activity", ".Calculator");


        //  Common set of capabilities
        desiredCapabilities.setCapability("appium:app-package", "com.google.android.apps.chrome.IntentDispatcher");
        desiredCapabilities.setCapability("appium:app-activity", "android.intent.action/.Main");
        desiredCapabilities.setCapability("browserName", "Chrome");

        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        //desiredCapabilities.setCapability("browserName", "chrome");
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 10000);


        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver =new AndroidDriver<AndroidElement>(remoteUrl, desiredCapabilities);
        if(driver == null){
            System.out.println("driver is null..............");
        }

    }

   // @Test
    public void testCalculatorPlus() throws InterruptedException {

        Thread.sleep(1000);

        {
            MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
            el1.click();

            MobileElement el2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
            el2.click();

            MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
            el3.click();

            MobileElement el4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
            el4.click();

            MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
            el5.click();

            MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
            el6.click();

            Assert.assertEquals(driver.findElementById("com.android.calculator2:id/result").getText(), 64);

        }
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
