package com.inivos.config;

import com.inivos.config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/resources/ios-manager.properties"
})
public interface IosConfig extends Config {
    @Key("iosURL")
    @ConverterClass(StringToURLConverter.class)
    URL iosUrl();
}
