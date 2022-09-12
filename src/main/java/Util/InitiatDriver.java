package Util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.net.URL;

public class InitiatDriver {

    static AppiumDriverLocalService service = null;
    Data data=new Data();
    public AppiumDriverLocalService startAppiumServer() throws Exception{
        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File(data.readProperties().getProperty("NodeLocation")))
                .withAppiumJS(new File(data.readProperties().getProperty("AppiumLocation")))
                .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub")
                .usingPort(4724).withIPAddress("127.0.0.1"));
      //  service.start();
        System.out.println(service.getUrl().toString());
        return service;
    }

    public void stopAppiumServer() throws Exception{
        startAppiumServer().stop();
    }
}
