package com.inivos.driver.entity;

import com.inivos.enums.BrowserRemoteModeType;
import com.inivos.enums.BrowserType;
import com.inivos.enums.RunModeType;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WebDriverData {

    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
    private RunModeType runModeType;

}
