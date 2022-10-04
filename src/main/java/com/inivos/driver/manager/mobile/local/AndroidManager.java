package com.inivos.driver.manager.mobile.local;

import com.inivos.config.AndroidConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Provides the Android Driver with Preset Capabilities.
 */
public final class AndroidManager {
    private AndroidManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", 10);
        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appium:automationName", "Appium");
        desiredCapabilities.setCapability("browserName", "Android");
       // capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/android-app.apk");
//        desiredCapabilities.setCapability("appPackage", "com.android.contacts");
//        desiredCapabilities.setCapability("appActivity", "activities.DialtactsActivity");

        desiredCapabilities.setCapability(MobileCapabilityType.APP, "~/Downloads/Findlocal_debug.apk");

        try {
//            return new RemoteWebDriver( new URL(AndroidConfigFactory.getConfig().androidUrl().toString()),desiredCapabilities);

              return new RemoteWebDriver( new URL("http", "127.0.0.1", 4723, "/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
