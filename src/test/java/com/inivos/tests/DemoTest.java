package com.inivos.tests;



import com.inivos.config.BrowserStackConfigfactory;
import org.testng.annotations.Test;
public class DemoTest {


    @Test
    public void testLogin(){
        System.out.println(BrowserStackConfigfactory.getConfig().browserStackUrl());
    }
}
