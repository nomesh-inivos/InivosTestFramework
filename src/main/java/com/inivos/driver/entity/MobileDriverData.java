package com.inivos.driver.entity;

import com.inivos.enums.MobilePlatformType;
import com.inivos.enums.MobileRemoteModeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class MobileDriverData {

    private MobileRemoteModeType mobileRemoteModeType;
    private MobilePlatformType mobilePlatformType;

}
