package com.inivos.tests;

import com.inivos.driver.manager.web.BrowserStackChromeManager;
import com.inivos.driver.manager.web.BrowserStackFirefoxManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class TestBrowserStackChromeManager {

    @Test
    public void testChrome() throws MalformedURLException {
        WebDriver driver = BrowserStackChromeManager.getDriver();
        driver.manage().window().maximize();

        driver.get("https://www.browserstack.com/users/sign_in");

        WebElement username=driver.findElement(By.id("user_email_login"));
        WebElement password=driver.findElement(By.id("user_password"));
//        WebElement loginButton=driver.findElement(By.id("user_submit"));
        WebElement loginButton=driver.findElement(By.name("commit"));

        username.sendKeys("nomeshd@gmail.com");
        password.sendKeys("0M3V@2314");
        loginButton.click();

        String actualUrl="https://live.browserstack.com/dashboard";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("closing driver......");
            driver.close();
        }
    }

    @Test
    public void testSafari() throws MalformedURLException {
        WebDriver driver = BrowserStackFirefoxManager.getDriver();
        driver.get("http://www.ikman.lk");
    }
}
