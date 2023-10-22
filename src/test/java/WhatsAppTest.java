import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class WhatsAppTest {


    public  static WebDriver driver;
    public static void main(String[] args) {
        try {
            openTelephoneApp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void openTelephoneApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","Samsung J7");
        cap.setCapability("udid","5203da1f603bb46b");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","8.1.0");
        cap.setCapability("appPackage","com.android.phone");
        cap.setCapability("appActivity","com.android.phone.EmergencyDialer");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        System.out.println("Application started....");

    }
}
