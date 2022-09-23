package com.inivos.config.converters;

import com.inivos.enums.BrowserRunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

/**
 * Converts the Browser RunMode from String to ENUM --> LOCAL or REMOTE
 */
public class StringToBrowserRunModeTypeConverter implements Converter<BrowserRunModeType> {
    @Override
    public BrowserRunModeType convert(Method method, String browserRunMode) {
        return BrowserRunModeType.valueOf(browserRunMode.toUpperCase());
    }
}
