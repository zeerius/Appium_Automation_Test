import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Substraction extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementById("com.example.calculator:id/operan_1").sendKeys("12345");
        driver.findElementById("com.example.calculator:id/kurang").click();
        driver.findElementById("com.example.calculator:id/operan_2").sendKeys("54321");
        driver.findElementById("com.example.calculator:id/hasil").click();

        driver.findElementById("com.example.calculator:id/operan_2").sendKeys("27");
        driver.findElementById("com.example.calculator:id/hasil").click();

        driver.findElementById("com.example.calculator:id/operan_1").sendKeys("972");
        driver.findElementById("com.example.calculator:id/hasil").click();
        driver.findElementById("com.example.calculator:id/hapus").click();
    }
}