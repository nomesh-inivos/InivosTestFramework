package com.inivos.tests.web;

import com.inivos.pages.HomePage;
import com.inivos.pages.LoginPage;
import com.inivos.tests.web.base.WebBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static com.inivos.driver.DriverManager.getDriver;

public class AddUserTest  extends WebBase {

//    @Test
//    public void testAddUsers(){
//        new LoginPage().loginToApplication("Admin","admin123")
//                .navigateToAddUsersPage();
//    }
@Test
public void testLogin() {
    getDriver().manage().window().maximize();

    new LoginPage().loginToApplication("Admin","admin123");

//    String expectedUrl = "";
//    String loadedUrl = "";
//
//    Assert.assertEquals(expectedUrl, loadedUrl);
}

    @AfterClass
    public void tearDown() {
        if (getDriver() != null){
            getDriver().quit();
        }
    }

}
