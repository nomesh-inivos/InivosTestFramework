package com.inivos.pages.ZeeonTest;

import com.inivos.util.PageActionsHelper;
import org.openqa.selenium.By;

public class HomePage {

    private static  By VIDEO_LINK = By.xpath("//div[@class='looped-video']");
    private static  By LOGIN_TEXT = By.xpath("//a[@href='/login']");

    public static By getVideoLink() {
        return VIDEO_LINK;
    }

    public static void setVideoLink() {
    }

    public static LoginPage getLoginText() {
        PageActionsHelper.clickLoginButton(LOGIN_TEXT);
        return new LoginPage();
    }

    public static void setLoginText() {
    }

    public LoginPage loginToApplication (String userName, String password) {
        PageActionsHelper.clickLoginButton(LOGIN_TEXT);
        return new LoginPage();
    }

}
