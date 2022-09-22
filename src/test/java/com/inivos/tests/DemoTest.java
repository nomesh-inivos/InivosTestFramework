package com.inivos.tests;

import com.inivos.config.BrowserStackConfigfactory;
import com.inivos.config.ConfigurationFactory;
import com.inivos.config.FrameworkConfig;
import com.inivos.enums.BrowserType;
import org.aeonbits.owner.ConfigCache;
import org.testng.annotations.Test;
import static org.aeonbits.owner.ConfigCache.getOrCreate;


public class DemoTest {
    @Test
    public void testLogin(){

         System.out.println(BrowserStackConfigfactory.getConfig().browserStackUrl());

    }
}
