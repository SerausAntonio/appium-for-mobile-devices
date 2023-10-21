import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    public  static WebDriver driver;
    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","Samsung J7");
        cap.setCapability("udid","5203da1f603bb46b");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","8.1.0");
        cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
       cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
        //cap.setCapability("appPackage","com.samsung.android.calendar");
        //cap.setCapability("appActivity","com.android.calendar.AllInOneActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        System.out.println("Application started....");
        driver.findElement(By.id("bt_02")).click();
        driver.findElement(By.id("bt_add")).click();
        driver.findElement(By.id("bt_05")).click();
        driver.findElement(By.id("bt_equal")).click();
        System.out.println(driver.findElement(By.id("txtCalc")).getText());
        driver.findElement(By.id("bt_clear")).click();
        driver.findElement(By.id("bt_02")).click();
        driver.findElement(By.id("bt_mul")).click();
        driver.findElement(By.id("bt_05")).click();
        driver.findElement(By.id("bt_equal")).click();
        System.out.println(driver.findElement(By.id("txtCalc")).getText());
        driver.findElement(By.id("bt_clear")).click();

    }
}
