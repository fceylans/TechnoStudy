package TechnoStudy;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Set;

public class TermsOfUse extends BaseDriver {

    @Test(groups = {"Smoke Test"})
    public void Test_08()
    {
        Elements elements=new Elements();
        JavascriptExecutor js=(JavascriptExecutor)driver;

        driver.get("https://techno.study/tr/");

        WebElement footer= driver.findElement(By.xpath("(//div[@class='tn-atom'])[1]"));
        js.executeScript("arguments[0].scrollIntoView();", footer);

        wait.until(ExpectedConditions.visibilityOf(elements.checkBoxFile));
        Assert.assertTrue(elements.checkBoxFile.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(elements.checkBox)).click();

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
































