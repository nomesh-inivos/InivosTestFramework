package com.inivos.tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

    public class SampleTest {

        public static void main(String[] args) throws MalformedURLException, InterruptedException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("appium:platformVersion", 10);
            desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
            desiredCapabilities.setCapability("appium:automationName", "Appium");
            desiredCapabilities.setCapability("appium:app", "~/Downloads/chromedriver");
//            desiredCapabilities.setCapability("appium:app", "~/Downloads/Findlocal_debug.apk");
            desiredCapabilities.setCapability("appium:app-package", "com.google.android.apps.chrome");
            desiredCapabilities.setCapability("appium:app-activity", "com.android.chrome/.Main");
            desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
            desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
            desiredCapabilities.setCapability("browserName", "chrome");
            desiredCapabilities.setCapability("appium:newCommandTimeout", 10000);
            desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

            URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
            WebDriver driver = new AndroidDriver(new URL(remoteUrl.getProtocol(), remoteUrl.getHost(), remoteUrl.getPort(), "/wd/hub"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

            System.out.println("test has started......");

            try{
                driver.get("http://www.google.com");
                WebElement query = driver.findElement(By.name("q"));
                query.sendKeys("Test");
                Thread.sleep(10000);

            }catch(Exception e){ e.printStackTrace();}


        }
    }


