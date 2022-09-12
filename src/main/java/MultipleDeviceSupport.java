import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MultipleDeviceSupport {

    public IOSDriver getSafari() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "13.3");
        capabilities.setCapability("deviceName", "iPhone 13");
        capabilities.setCapability("udid", "42F69E64-5289-4A2A-ADE1-E0D300D403E1");
        capabilities.setCapability("browserName", "Safari");
        capabilities.setCapability("automationName", "XCUITest");
        return new IOSDriver(new URL("http://localhost:4725/wd/hub"), capabilities);
    }

    public AndroidDriver getChrome() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("automationName", "UiAutomator2");
        return new AndroidDriver(new URL("http://localhost:4725/wd/hub"), capabilities);
    }

}
