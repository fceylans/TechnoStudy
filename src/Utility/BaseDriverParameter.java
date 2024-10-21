package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseDriverParameter {
    public static SoftAssert softAssert = new SoftAssert();
    public WebDriver driver;
    public WebDriverWait wait;
    public static JavascriptExecutor js;

    @BeforeClass
    @Parameters("browserTipi")
    public void setup(String browserTipi) {

        if (browserTipi.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserTipi.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserTipi.equals("edge")) {
            driver = new EdgeDriver();
        }

        driver.get("https://technostudy.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
    }

    @AfterClass
    public void KapanisIslemleri() {

        Tools.Wait(3);
        driver.quit();
    }

}
