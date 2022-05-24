import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class NumberPattern extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        String value = "10";

        for (int i = 1; i <= 5; i++) {
            driver.findElementById("com.example.calculator:id/operan_1").sendKeys(value);
            driver.findElementById("com.example.calculator:id/kali").click();
            driver.findElementById("com.example.calculator:id/operan_2").sendKeys("5");
            driver.findElementById("com.example.calculator:id/hasil").click();

            value = driver.findElementById("com.example.calculator:id/preview").getText();
            driver.findElementById("com.example.calculator:id/hapus").click();

            driver.findElementById("com.example.calculator:id/operan_1").sendKeys(value);
            driver.findElementById("com.example.calculator:id/kurang").click();
            driver.findElementById("com.example.calculator:id/operan_2").sendKeys("10");
            driver.findElementById("com.example.calculator:id/hasil").click();

            value = driver.findElementById("com.example.calculator:id/preview").getText();
            driver.findElementById("com.example.calculator:id/hapus").click();
        }
    }
}
