package com.inivos.driver.entity;

import com.inivos.enums.BrowserRemoteModeType;
import com.inivos.enums.BrowserType;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WebDriverData {

    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;

}
