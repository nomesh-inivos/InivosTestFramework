package com.inivos.config.converters;

import com.inivos.enums.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

/**
 * Converts the Browser RunMode from String to ENUM --> LOCAL or REMOTE
 */
public class StringToBrowserRunModeTypeConverter implements Converter<RunModeType> {
    @Override
    public RunModeType convert(Method method, String browserRunMode) {
        return RunModeType.valueOf(browserRunMode.toUpperCase());
    }
}
