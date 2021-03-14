import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        options.setLaunchDelay(5000);
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);
        driver.findElement(By.id("num3Button")).click();
        driver.findElement(By.name("Seven")).click();
        driver.findElement(By.id("plusButton")).click();
        driver.findElement(By.name("Seven")).click();
        driver.findElement(By.id("equalButton")).click();


        String strResult = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
        strResult= strResult.replace("Display is ","");
        System.out.println("Result is :"+ strResult);
        

    }
}
