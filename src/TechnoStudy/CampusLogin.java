package TechnoStudy;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CampusLogin extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://techno.study/");
        driver.manage().window().maximize();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href=\"https://campus.techno.study\"])[1]")));
        WebElement loginbutton= driver.findElement(By.xpath("(//a[@href=\"https://campus.techno.study\"])[1]"));
        loginbutton.click();

        Assert.assertTrue("Campuse giriş yapılamadı",
                driver.getCurrentUrl().equalsIgnoreCase("https://campus.techno.study/"));




        BekleKapat();













    }









}
