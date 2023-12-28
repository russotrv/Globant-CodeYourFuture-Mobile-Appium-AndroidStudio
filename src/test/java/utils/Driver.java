package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private AndroidDriver driver;

    public Driver() {
        try {
            this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),this.getDesiredCapabilities());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    public AndroidDriver getDriver() {
        return driver;
    }

    private DesiredCapabilities getDesiredCapabilities(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appium:appPackage", "com.wdiodemoapp");
        desiredCapabilities.setCapability("appium:appActivity", "MainActivity");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:app", "C:\\Users\\Juan\\Desktop\\program\\AndroidNativeAPK\\Android-NativeDemoApp-0.4.0.apk");

        return desiredCapabilities;
    }
}