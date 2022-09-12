
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class RunMultipleDevice {

    private IOSDriver safari;
    private AndroidDriver chrome;
    StartAppium startAppium = new StartAppium();
    MultipleDeviceSupport multipleDeviceSupport = new MultipleDeviceSupport();

    @Before
    public void setUp() throws Exception {
        chrome = multipleDeviceSupport.getChrome();
        safari = multipleDeviceSupport.getSafari();
    }


    @After
    public void tearDown() {
        if (safari != null) {
            safari.quit();
        }
        if (chrome != null) {
            chrome.quit();
        }
    }

    @Test
    public void test(){

        chrome.get("https://www.google.com/");
        safari.get("https://www.google.com/");
        System.out.println("run successfully");
    }
}
