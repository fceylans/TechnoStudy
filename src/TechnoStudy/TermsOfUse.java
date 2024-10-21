package TechnoStudy;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Set;

public class TermsOfUse extends BaseDriverParameter {

    @Test(groups = {"Smoke Test"})
    @Parameters("browserTipi")
    public void Test_08()
    {
        POM locators = new POM();
        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement footer= driver.findElement(By.xpath("(//div[@class='tn-atom'])[1]"));
        js.executeScript("arguments[0].scrollIntoView();", footer);

        wait.until(ExpectedConditions.visibilityOf(locators.checkBoxFile));
        Assert.assertTrue(locators.checkBoxFile.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(locators.checkBox)).click();

        String homepage = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            if (!handle.equals(homepage)) {
                driver.switchTo().window(handle);
                Assert.assertTrue(driver.getTitle().contains("Kullanım Şartları"));

            }
        }
    }
}
































