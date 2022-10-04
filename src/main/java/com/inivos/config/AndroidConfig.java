package com.inivos.config;

import com.inivos.config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/resources/android-manager.properties"
})
public interface AndroidConfig extends Config {
    @Key("androidUrl")
    @ConverterClass(StringToURLConverter.class)
    URL androidUrl();


}
