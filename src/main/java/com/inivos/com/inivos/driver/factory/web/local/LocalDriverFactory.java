package com.inivos.com.inivos.driver.factory.web.local;

import com.inivos.com.inivos.driver.manager.web.ChromeManager;
import com.inivos.com.inivos.driver.manager.web.FireFoxManager;
import com.inivos.com.inivos.exceptions.DriverAgentNotFoundException;
import com.inivos.enums.BrowserType;
import org.openqa.selenium.WebDriver;

/**
 * This class is specifically used to work on local browser setup like Firefox and Chrome.
 */
public final class LocalDriverFactory {
    private LocalDriverFactory() {
    }

    /**
     * Returns the correct Web agent driver.
     *
     * @return
     * @throws DriverAgentNotFoundException
     */
    public static WebDriver getDriver(BrowserType browserType) throws DriverAgentNotFoundException {
        WebDriver driver;
        if (isBrowserChrome(browserType)) {
            driver = ChromeManager.getChromeDriver();
        } else if (isBrowserFireFox(browserType)) {
            driver = FireFoxManager.getFireFoxDriver();
        } else {
            /** setting up default Agent as CHROME **/
            driver = ChromeManager.getChromeDriver();
        }

        return driver;
    }

    private static boolean isBrowserChrome(BrowserType browserType) {
        return browserType == BrowserType.CHROME;
    }

    private static boolean isBrowserFireFox(BrowserType browserType) {
        return browserType == BrowserType.FIREFOX;
    }

}
