package com.inivos.config;

import org.aeonbits.owner.ConfigCache;

public final class BrowserStackConfigfactory{
    private BrowserStackConfigfactory(){}

    public static BrowserStackConfig getConfig(){
        return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}
