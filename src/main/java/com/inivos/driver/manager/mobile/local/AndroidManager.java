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
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", 10);
        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554"); //emulator-5554
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:app-package", "com.google.android.apps.chrome.IntentDispatcher");
        desiredCapabilities.setCapability("appium:app-activity", "android.intent.action/.Main");
        desiredCapabilities.setCapability("browserName", "Chrome");
        desiredCapabilities.setCapability("showChromedriverLog", true);

        //desiredCapabilities.setCapability("appium:app", "~/Downloads/Findlocal_debug.apk");

        desiredCapabilities.setCapability("appium:newCommandTimeout", 10000);


        try {
            URL remoteUrl = new URL("http://127.0.0.1/wd/hub");

            //return new RemoteWebDriver( new URL(AndroidConfigFactory.getConfig().androidUrl().toString()),desiredCapabilities);
            return new RemoteWebDriver( new URL(remoteUrl.getProtocol(), remoteUrl.getHost(), remoteUrl.getPort(), "/wd/hub/"), desiredCapabilities);

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
