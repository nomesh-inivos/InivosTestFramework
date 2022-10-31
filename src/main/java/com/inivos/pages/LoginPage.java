package com.inivos.pages;

import com.inivos.util.PageActionsHelper;
import org.openqa.selenium.By;

public class LoginPage {



    private static final By PASSWORD_TEXT_BOX = By.xpath("//input[@type='password']");
    private static final By USER_NAME_TEXT_BOX = By.xpath("//input[@name='username']");
    private static final By LOGIN_BUTTON = By.xpath("//button");
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


    public  HomePage loginToApplication (String userName, String password) {

        HomePage homepage = setUserNameTextBox(userName)
                .setPasswordTextBox(password)
                .setLoginButton();
        PageActionsHelper.implicitelyWait();
        return homepage;
    }
}