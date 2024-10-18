package TechnoStudy;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubMenuCourses extends BaseDriver {

    @Test(groups = {"Smoke Test"})
    public void subMenuCourses() {
        POM locators = new POM();

        locators.courseDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(locators.sdet));
        locators.sdet.click();
        wait.until(ExpectedConditions.visibilityOf(locators.controlTextSdet));

        String expectedSdetTitle = "YAZILIM\n" +
                "TEST UZMANI";
        Assert.assertEquals(locators.controlTextSdet.getText(), expectedSdetTitle, "SDET Kursu başlığı beklenenden farklı!");
        Assert.assertTrue(locators.shortTextSdet.isDisplayed(), "SDET kursunun kısa açıklaması görünmüyor!");

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Tools.Wait(2);

        driver.navigate().back();

        locators.courseDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(locators.androidApp));
        locators.androidApp.click();
        wait.until(ExpectedConditions.visibilityOf(locators.controlTextAndroid));

        String expectedAndroidTitle = "Android Uygulama Geliştirme";
        Assert.assertEquals(locators.controlTextAndroid.getText(), expectedAndroidTitle, "Android kursu başlığı beklenenden farklı!");
        Assert.assertTrue(locators.shortTextAndroid.isDisplayed(), "Android kursunun kısa açıklaması görünmüyor!");

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Tools.Wait(2);

        driver.navigate().back();

        locators.courseDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(locators.dataScience));
        locators.dataScience.click();

        wait.until(ExpectedConditions.visibilityOf(locators.controlTextDataSci));
        String expectedDataSciTitle = "İş Dünyasında Veri Bilimi";
        Assert.assertEquals(locators.controlTextDataSci.getText(), expectedDataSciTitle, "Veri Bilimi kursu başlığı beklenenden farklı!");
        Assert.assertTrue(locators.shorTextData.isDisplayed(), "Veri Bilimi kursunun kısa açıklaması görünmüyor!");

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Tools.Wait(2);
    }
}

