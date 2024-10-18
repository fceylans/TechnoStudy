package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    @BeforeClass
    public void FirstOptions(){
        System.out.println("Baslangic islemleri yapiliyor");

        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        js=(JavascriptExecutor)driver;

    }

    @AfterClass
    public void LastOptions(){
        System.out.println("Kapanis islemleri yapiliyor");
        driver.quit();
    }
}
