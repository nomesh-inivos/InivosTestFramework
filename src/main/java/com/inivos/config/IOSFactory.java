package com.inivos.config;

import org.aeonbits.owner.ConfigCache;

import java.net.MalformedURLException;

/**
 * Returns the configuration object for IOS related devices.
 */
public final class IOSFactory {

    private IOSFactory(){}

    public static IosConfig getConfig() throws MalformedURLException {
            return ConfigCache.getOrCreate(IosConfig.class);
        }
}
