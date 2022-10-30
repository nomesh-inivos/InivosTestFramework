package com.inivos.driver.manager.impl.mobile.local;

import com.inivos.config.IOSFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class IosManager {
    private IosManager(){}

    public static WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12");
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/ios-app.zip");

        return new RemoteWebDriver( new URL(IOSFactory.getConfig().iosUrl().toString()),capabilities);
    }
}
