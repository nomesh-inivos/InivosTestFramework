package com.inivos.tests.web;

import com.inivos.config.ConfigurationFactory;
import com.inivos.driver.DriverManager;
import com.inivos.tests.web.base.WebBase;
import org.testng.annotations.Test;


public class GoogleTitleTest extends WebBase {

    @Test
    public void testLogin(){
        //test
        System.out.println("webUrl......"+ ConfigurationFactory.getConfig().webUrl());
    }
}
