import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class MultipleByTwo extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementById("com.example.calculator:id/operan_1").sendKeys("1");
        driver.findElementById("com.example.calculator:id/kali").click();
        driver.findElementById("com.example.calculator:id/operan_2").sendKeys("2");
        driver.findElementById("com.example.calculator:id/hasil").click();

        for (int i = 1; i <= 10; i++) {
            String value = driver.findElementById("com.example.calculator:id/preview").getText();
            driver.findElementById("com.example.calculator:id/operan_1").sendKeys(value);
            driver.findElementById("com.example.calculator:id/hasil").click();
        }
    }
}
