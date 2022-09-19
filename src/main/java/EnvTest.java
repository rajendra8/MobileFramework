import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class EnvTest {
    AndroidDriver driver;
    private static String APP = "/Users/raj_vodafone/Downloads/app_jdsports_release_4.apk";
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
        driver = new AndroidDriver(new URL("http://localhost:2425/wd/hub"), caps);
    }
}
