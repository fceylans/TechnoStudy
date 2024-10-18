package TechnoStudy;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SubmenuSocialMedia extends BaseDriver {

    @Test(groups = {"Smoke Test"})
    public void US_05() {
        Elements elements = new Elements();

        driver.get("https://techno.study/tr/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement footer = driver.findElement(By.id("rec684017893"));
        js.executeScript("arguments[0].scrollIntoView();", footer);

        wait.until(ExpectedConditions.visibilityOf(elements.facebook));
        Assert.assertTrue(elements.facebook.isDisplayed(), "Simge görünmüyor");
        wait.until(ExpectedConditions.visibilityOf(elements.instagram));
        Assert.assertTrue(elements.instagram.isDisplayed(), "Simge görünmüyor");
        wait.until(ExpectedConditions.visibilityOf(elements.youtube));
        Assert.assertTrue(elements.youtube.isDisplayed(), "Simge görünmüyor");
        wait.until(ExpectedConditions.visibilityOf(elements.linkedin));
        Assert.assertTrue(elements.linkedin.isDisplayed(), "Simge görünmüyor");

        elements.facebook.click();
        driver.navigate().back();

        elements.instagram.click();
        driver.navigate().back();

        elements.youtube.click();
        driver.navigate().back();

        elements.linkedin.click();
        driver.navigate().back();


    }
}
