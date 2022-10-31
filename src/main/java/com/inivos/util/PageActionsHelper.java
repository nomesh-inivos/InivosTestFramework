package com.inivos.util;

import com.inivos.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import static com.inivos.driver.DriverManager.getDriver;

/**
 * This class holds the generic actions related to a web page.
 */
public class PageActionsHelper {

    private  PageActionsHelper(){}
    private static final int maxtime = 20;
    private static final int implicitlyWait = 20;
    /**
     * Creating a custom findElement method that uses Explicit wait and waits for an
     * element to be clickable
     */
    public static WebElement waitUntilClickableAndClick(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), maxtime);
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    /**
     * Waits for an element to contain a text matched by the given pattern(regex)
     */
    public static Boolean doesElementContainTextPattern(By by, String pattern) {
        WebDriverWait wait = new WebDriverWait(getDriver(), maxtime);
        return wait.until(ExpectedConditions.textMatches(by, Pattern.compile(pattern)));
    }

    public static void waitAndClick(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), maxtime);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));

        //trigger the reaload of the page
        getDriver().findElement(by).click();
        // wait the element "Add Item" to become stale
        wait.until(ExpectedConditions.stalenessOf(element));
        // click on "Add Item" once the page is reloaded
        wait.until(ExpectedConditions.presenceOfElementLocated(by)).click();
        //getDriver().findElement(by).click();
    }
    public static void waitAndSendKeys(By by, String value) {
        WebDriverWait wait = new WebDriverWait(getDriver(), maxtime);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));

        //trigger the reload of the page
        implicitelyWait();
        // wait the element "Add Item" to become stale
        //wait.until(ExpectedConditions.stalenessOf(element));
        // click on "Add Item" once the page is reloaded
        wait.until(ExpectedConditions.presenceOfElementLocated(by)).sendKeys(value);
        getDriver().findElement(by).sendKeys(value);
    }

    public static LoginPage clickLoginButton(By by) {
//        WebDriverWait wait = new WebDriverWait(getDriver(), maxtime);
        //implicit wait
        implicitelyWait();
        // identify element with link text
        WebElement m =getDriver().findElement(by);
        m.click();
        System.out.println("Link is clicked......");
       implicitelyWait();
        return new LoginPage();


    }

    private static void implicitelyWait() {
        getDriver().manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
    }
    private static WebElement selectFirstElementFromList(String firstElementName) throws NoSuchElementException {
        List<WebElement> elementList = getDriver().findElements(By.name(firstElementName));
        return (elementList == null) ? null :  elementList.get(0);
    }
}
