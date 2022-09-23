package com.inivos.config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigurationFactory {

    private ConfigurationFactory(){}

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
