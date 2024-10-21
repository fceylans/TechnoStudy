package TechnoStudy;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SubmenuSocialMedia extends BaseDriverParameter {

    @Test(groups = {"Smoke Test"})
    @Parameters("browserTipi")
    public void US_05() {
        POM locators = new POM();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement footer = driver.findElement(By.id("rec684017893"));
        js.executeScript("arguments[0].scrollIntoView();", footer);

        wait.until(ExpectedConditions.visibilityOf(locators.facebook));
        Assert.assertTrue(locators.facebook.isDisplayed(), "Simge görünmüyor");
        wait.until(ExpectedConditions.visibilityOf(locators.instagram));
        Assert.assertTrue(locators.instagram.isDisplayed(), "Simge görünmüyor");
        wait.until(ExpectedConditions.visibilityOf(locators.youtube));
        Assert.assertTrue(locators.youtube.isDisplayed(), "Simge görünmüyor");
        wait.until(ExpectedConditions.visibilityOf(locators.linkedin));
        Assert.assertTrue(locators.linkedin.isDisplayed(), "Simge görünmüyor");

        locators.facebook.click();
        driver.navigate().back();

        locators.instagram.click();
        driver.navigate().back();

        locators.youtube.click();
        driver.navigate().back();

        locators.linkedin.click();
        driver.navigate().back();


    }
}
