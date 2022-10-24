package com.inivos.pages;

import com.inivos.util.PageActionsHelper;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By USER_NAME_TEXT_BOX = By.id("txtUsername");
    private static final By PASSWORD_TEXT_BOX = By.id("txtPassword");
    private static final By LOGIN_BUTTON = By.id("btnLogin");

    public LoginPage setUserNameTextBox(String userName) {
        PageActionsHelper.waitAndSendKeys(USER_NAME_TEXT_BOX,userName);
        return this;
    }

    public LoginPage setPasswordTextBox(String password) {
        PageActionsHelper.waitAndSendKeys(PASSWORD_TEXT_BOX,password);
        return this;
    }

    public LoginPage setLoginButton() {
        PageActionsHelper.waitAndClick(LOGIN_BUTTON);
        return this;
    }
}
