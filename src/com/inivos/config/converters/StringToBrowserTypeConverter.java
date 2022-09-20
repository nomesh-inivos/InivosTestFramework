package com.inivos.config;

import com.inivos.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert() {
        return return BrowserType.valueOf(browserType);
    }

}
