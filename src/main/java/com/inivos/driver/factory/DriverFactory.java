package com.inivos.driver.factory;

import com.inivos.driver.IMobileDriver;
import com.inivos.driver.IWebDriver;
import com.inivos.driver.impl.web.LocalWebDriverImpl;
import com.inivos.driver.impl.web.RemoteWebDriverImpl;
import com.inivos.enums.RunModeType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;



public final class DriverFactory {
    private DriverFactory() {}

    /**
     * below is the same as commented methods at last, using Functional Programming & Supplier Interface.
     * Inside the static method, Method Reference (java8) has been used to optimise the code.
     */
    private static final Map<RunModeType, Supplier<IWebDriver>> WEB = new EnumMap<>(RunModeType.class);
    private static final Map<RunModeType, Supplier<IMobileDriver>> MOBILE = new EnumMap<>(RunModeType.class);

    static {
        WEB.put(RunModeType.LOCAL, LocalWebDriverImpl::new);
        WEB.put(RunModeType.REMOTE, RemoteWebDriverImpl::new);
    }

    public static IWebDriver getDriverForWeb(RunModeType runModeType){
        return WEB.get(runModeType).get();
    }
    public static IMobileDriver getDriverForMobile(RunModeType runModeType){
        return MOBILE.get(runModeType).get();
    }

/**  the below code is optimised with Java-8 functional programming and method references with Supplier<> **/

//    public static WebDriver getDriverForWeb(WebDriverData webDriverData) throws DriverAgentNotFoundException, MalformedURLException {
//        return (webDriverData.getRunModeType() == RunModeType.LOCAL)
//            ? new LocalWebDriverImpl().getDriver(webDriverData)
//            : new RemoteWebDriverImpl().getDriver(webDriverData);
//    }
//
//    public static WebDriver getDriverForMobile(MobileDriverData mobileDriverData) throws MalformedURLException, DriverAgentNotFoundException {
//        return (mobileDriverData.getRunModeType() == RunModeType.LOCAL)
//                ? new LocalMobileDriverImpl().getDriver(mobileDriverData)
//                : new RemoteMobileDriverImpl().getDriver(mobileDriverData);
//    }

}
