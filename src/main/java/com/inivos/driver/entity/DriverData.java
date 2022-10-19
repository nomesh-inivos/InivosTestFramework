package com.inivos.driver.entity;

import com.inivos.enums.*;
import lombok.Data;
import lombok.Builder;

@Builder
@Data
public class DriverData {
    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
    private MobilePlatformType mobilePlatformType;
    private RunModeType runModeType;
    private MobileRemoteModeType mobileRemoteModeType;


}
