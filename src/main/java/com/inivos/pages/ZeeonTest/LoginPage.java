package com.inivos.pages.ZeeonTest;

import com.inivos.util.PageActionsHelper;
import org.openqa.selenium.By;

public class LoginPage {

    private static final int maxtime = 20;
    private static  By USER_NAME_TEXT_BOX = By.xpath("//input[@placeholder='Email']");
    private static  By PASSWORD_TEXT_BOX = By.xpath("//input[@placeholder='Password']");
    private static  By LOGIN_BUTTON = By.xpath("//span[text()='SIGN IN AND GET STARTED']");




    private  LoginPage setUserNameTextBox(String userName) {
        PageActionsHelper.waitAndSendKeys(USER_NAME_TEXT_BOX,userName);
        return this;
    }

    private LoginPage setPasswordTextBox(String password) {
        PageActionsHelper.waitAndSendKeys(PASSWORD_TEXT_BOX,password);
        return this;
    }

    private HomePage setLoginButton() {
        PageActionsHelper.waitAndClick(LOGIN_BUTTON);
        return new HomePage();
    }
    public HomePage loginToApplication (String userName, String password) {
        return setUserNameTextBox(userName)
                .setPasswordTextBox(password)
                .setLoginButton();
    }


}
