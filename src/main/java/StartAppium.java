import Util.Data;
import Util.InitiatDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class StartAppium {

    private static String APP = "/Users/raj_vodafone/Downloads/app_jdsports_release_4.apk";
   private AndroidDriver driver =null;
     //SafariDriver S_driver;
    InitiatDriver initiatDriver=new InitiatDriver();
   @Before
   public  void startAppiumServer() throws Exception{
       initiatDriver.startAppiumServer().start();
   }

   @Test
    public  void startSession() throws Exception{

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("deviceName", "android");
        caps.setCapability("automationName", "UIAutomator2");
      //  caps.setCapability("browserName", "Chrome");
        caps.setCapability("AppActivity", "com.jd.jdsports.ui.MainActivity");
        caps.setCapability("AppPackage", "com.jd.jdsports.debug");
        caps.setCapability("app", APP);
        driver = new AndroidDriver(initiatDriver.startAppiumServer().getUrl(), caps);
    }

    @After
    public void stopServer() throws Exception{
       initiatDriver.stopAppiumServer();
    }
}