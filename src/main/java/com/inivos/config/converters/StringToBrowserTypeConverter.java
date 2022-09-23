package com.inivos.config.converters;

import com.inivos.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

import static java.util.Map.*;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {


    @Override
    public BrowserType convert(Method method, String browserType){
      Map<String,BrowserType> stringBrowserTypeMap=Map.of(
              "CHROME",BrowserType.CHROME,
              "FIREFOX",BrowserType.FIREFOX);
      return stringBrowserTypeMap.getOrDefault(browserType.toUpperCase(), BrowserType.CHROME);//returning CHROME as default
    }
}
