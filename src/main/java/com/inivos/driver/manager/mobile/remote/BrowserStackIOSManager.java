package com.inivos.driver.manager.mobile.remote;

import com.inivos.config.BrowserStackConfigfactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class BrowserStackIOSManager {

    public BrowserStackIOSManager() {
    }

    public static WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "parallel_test");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.0");
        capabilities.setCapability("build", "browserstack-build-1");
        capabilities.setCapability("osVersion", "11.0");

        return new RemoteWebDriver(new URL(BrowserStackConfigfactory.getConfig().browserStackUrl().toString()), capabilities);
    }
}

/*
 *{
 *   "server": "hub.browserstack.com",
 *   "user": "nomeshdesilva_GakEB8",
 *   "key": "vx7YkcfqxkaK9rqxm6zW",
 *   "capabilities": {
 *     "build": "browserstack-build-1",
 *     "name": "parallel_test",
 *     "browserstack.debug": true
 *   },
 *   "environments": {
 *     "env1": {
 *       "browserName": "ios",
 *       "deviceName": "iPhone 12 Pro",
 *       "osVersion": "16"
 *     },
 *     "env2": {
 *       "browserName": "ios",
 *       "deviceName": "iPad Air 4",
 *       "osVersion": "14"
 *     },
 *     "env3": {
 *       "browserName": "ios",
 *       "deviceName": "iPhone 12 Pro Max",
 *       "osVersion": "16"
 *     }
 *   }
 * }
 */
