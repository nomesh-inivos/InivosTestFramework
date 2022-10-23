package com.inivos.driver;

import org.openqa.selenium.WebDriver;

/**
 * This class is used to make the Driver Thread-Safe/ Synchronize by calling THREAD_LOCAL.
 * @returns ThreadSafe WebDriver
 */
public class DriverManager {

    private DriverManager() {}
    private static final ThreadLocal<WebDriver> THREAD_LOCAL = new ThreadLocal<>();

    public static void setDriver(WebDriver webdriver) {
        THREAD_LOCAL.set(webdriver);
    }

    public static void getDriver() {
        THREAD_LOCAL.get();
    }

    public static void unload() {
        THREAD_LOCAL.remove();
    }

}
