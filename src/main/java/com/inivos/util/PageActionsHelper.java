package com.inivos.util;

import com.inivos.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }
    public static void waitAndSendKeys(By by, String value) {
        WebDriverWait wait = new WebDriverWait(getDriver(), maxtime);
        wait.until(ExpectedConditions.presenceOfElementLocated(by)).sendKeys(value);
        System.out.println("sent key : "+ value);

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

    public static void implicitelyWait() {
        getDriver().manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
    }
    private static WebElement selectFirstElementFromList(String firstElementName) throws NoSuchElementException {
        List<WebElement> elementList = getDriver().findElements(By.name(firstElementName));
        return (elementList == null) ? null :  elementList.get(0);
    }
}
