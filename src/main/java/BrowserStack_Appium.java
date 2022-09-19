import Util.InitiatDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BrowserStack_Appium {

    public static String userName = "thejdeep_DxfNrX";
    public static String accessKey = "VH12UPNbC4Vz7ohycxFQ";

    private static String APP = "/Users/raj_vodafone/IdeaProjects/JDMOBILE/App/app-jdsports-debug.apk";
    private AndroidDriver driver =null;

    InitiatDriver initiatDriver=new InitiatDriver();
  //  @Before
    public  void startAppiumServer() throws Exception{
        initiatDriver.startAppiumServer().start();
    }


    public  void startSession() throws Exception{

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
       // caps.setCapability("platformVersion", "10");
     //   caps.setCapability("udid", "emulator-5554");
      //  caps.setCapability("deviceName", "android");
        caps.setCapability("automationName", "Appium");
      //  caps.setCapability("AppActivity", "com.jd.jdsports.ui.MainActivity");
      //  caps.setCapability("AppPackage", "com.jd.jdsports.live");
        caps.setCapability("app", "bs://1ff9a74756e2ce7ba1e12fd751cc37a7047f852e");
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "10.0");
       driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
//        driver = new AndroidDriver(initiatDriver.startAppiumServer().getUrl(), caps);
    }

    @After
    public void stopServer() throws Exception{
        initiatDriver.stopAppiumServer();
    }


    @Test
    public void browserStack_Test() throws Exception{
        DesiredCapabilities caps = new DesiredCapabilities();
      //  caps.setCapability("browserstack.user", "thejdeep_DxfNrX");
      //  caps.setCapability("browserstack.key", "VH12UPNbC4Vz7ohycxFQ");

        // Set URL of the application under test
        caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "Test By Raj");
        caps.setCapability("app", "bs://1ff9a74756e2ce7ba1e12fd751cc37a7047f852e");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);//
        String battry=driver.getBatteryInfo().toString();
        System.out.println(battry);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Home']")).click();
    }
}
//http://hub.browserstack.com/wd/hub