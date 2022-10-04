package com.inivos.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigCache;

import java.net.MalformedURLException;

/**
 * Factory to generate Android Specific Configuration class.
 */
public final class AndroidConfigFactory{
    private AndroidConfigFactory(){}

    public static AndroidConfig getConfig()  {
        return ConfigCache.getOrCreate(AndroidConfig.class);
    }
}
