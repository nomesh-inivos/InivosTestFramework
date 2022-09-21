package com.inivos.com.inivos.driver;

import com.inivos.com.inivos.driver.manager.ChromeManager;
import com.inivos.com.inivos.driver.manager.FireFoxManager;
import com.inivos.com.inivos.exceptions.DriverAgentNotFoundException;
import com.inivos.config.ConfigurationFactory;
import com.inivos.enums.BrowserType;
import org.openqa.selenium.WebDriver;


public final class LocalDriverFactory {
    private LocalDriverFactory() {
    }

    /**
     * Returns the correct Web agent driver.
     *
     * @return
     * @throws DriverAgentNotFoundException
     */
    public static WebDriver getDriver() throws DriverAgentNotFoundException {
        WebDriver driver;
        if (isBrowserChrome()) {
            driver = ChromeManager.getChromeDriver();
        } else if (isBrowserFireFox()) {
            driver = FireFoxManager.getFireFoxDriver();
        } else {
            /** setting up default Agent as CHROME **/
            driver = ChromeManager.getChromeDriver();
        }

        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigurationFactory.getConfig().browser().equals(BrowserType.CHROME);
    }

    private static boolean isBrowserFireFox() {
        return ConfigurationFactory.getConfig().browser().equals(BrowserType.FIREFOX);
    }

}
