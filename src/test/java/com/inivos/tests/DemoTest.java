package com.inivos.tests;

import com.inivos.config.ConfigurationFactory;
import com.inivos.config.FrameworkConfig;
import com.inivos.enums.BrowserType;
import org.aeonbits.owner.ConfigCache;
import org.testng.annotations.Test;
import static org.aeonbits.owner.ConfigCache.getOrCreate;


public class DemoTest {
    @Test
    public void testLogin(){
         FrameworkConfig config = ConfigCache.getOrCreate(FrameworkConfig.class);
        ConfigurationFactory.getConfig().browser();
         System.out.println(config.browser());

    }
}
