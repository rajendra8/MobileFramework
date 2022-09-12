import Util.Data;
import Util.InitiatDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
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

public class StartAppium_2 {

    private static String APP = "/Users/raj_vodafone/Desktop/OTT iOS Build/OTT_iOS_13_2/OTT.ipa";
    private IOSDriver driver =null;

    Data data=new Data();
   InitiatDriver initiatDriver =new InitiatDriver();


   @Before
   public void beforeTest() throws Exception{
       initiatDriver.startAppiumServer().start();
   }
    @Test
    public  void startSession() throws Exception{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "13.3");
        caps.setCapability("udid", "42F69E64-5289-4A2A-ADE1-E0D300D403E1");
        caps.setCapability("deviceName", "IPhone 13");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("browserName", "safari");
       // caps.setCapability("app", APP);
        driver = new IOSDriver(initiatDriver.startAppiumServer().getUrl(), caps);
    }

    @Test
    public void openGoogle(){
       driver.get("www.Google.com");
    }
    @After
    public void stopServer() throws Exception{
      initiatDriver.stopAppiumServer();
    }
}