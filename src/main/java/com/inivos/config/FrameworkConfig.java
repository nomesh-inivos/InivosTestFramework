package com.inivos.config;

import com.inivos.config.converters.StringToBrowserRemoteModeTypeConverter;
import com.inivos.config.converters.StringToBrowserRunModeTypeConverter;
import com.inivos.config.converters.StringToBrowserTypeConverter;
import com.inivos.config.converters.StringToURLConverter;
import com.inivos.enums.BrowserRemoteModeType;
import com.inivos.enums.BrowserRunModeType;
import com.inivos.enums.BrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/resources/config.properties"
})

//"system:properties",
// "System:env",

public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
    @Key("browserRunMode")
    @ConverterClass(StringToBrowserRunModeTypeConverter.class)
    BrowserRunModeType browserRunMode();
    @Key("browserRemoteMode")
    @ConverterClass(StringToBrowserRemoteModeTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();
    @Key("seleniumGridUrl")
    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridUrl();
    @Key("selenoidUrl")
    @ConverterClass(StringToURLConverter.class)
    URL selenoidUrl();
    @Key("browserStackUrl")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackUrl();

}
