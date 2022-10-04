package com.inivos.driver.manager.mobile.remote;

import com.inivos.config.BrowserStackConfigfactory;
import com.inivos.enums.MobileRemoteMethodType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class BrowserStackAndroidManager {

    public BrowserStackAndroidManager() {}

    public static WebDriver getDriver() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "parallel_test");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Xiaomi Redmi Note 11");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
            capabilities.setCapability("build", "browserstack-build-1");
            capabilities.setCapability("osVersion", "11.0");

            return new RemoteWebDriver( new URL(BrowserStackConfigfactory.getConfig().browserStackUrl().toString()),capabilities);
        }
    }