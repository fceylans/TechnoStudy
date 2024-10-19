package TechnoStudy;

import Utility.BaseDriverParameter;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CourseDetails extends BaseDriverParameter {

    @Test(groups = {"Smoke Test"})
    @Parameters("browserTipi")
    public void courseDetails() {

        POM locators = new POM();

        locators.courseSDET.click();
        wait.until(ExpectedConditions.visibilityOf(locators.detailedInformationButton));
        locators.detailedInformationButton.click();

        wait.until(ExpectedConditions.visibilityOf(locators.technoLogo));
        Assert.assertTrue(locators.technoLogo.isDisplayed(), "Techno Study logosu görünmüyor!");
        Assert.assertTrue(locators.applyNowButton.isDisplayed(), "Başvuru butonu görünmüyor!");

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Tools.Wait(2);

        driver.navigate().back();
        wait.until(ExpectedConditions.visibilityOf(locators.courseSDET));

        locators.courseAndroidApplication.click();
        wait.until(ExpectedConditions.visibilityOf(locators.androidApplicationButton));
        locators.androidApplicationButton.click();

        wait.until(ExpectedConditions.visibilityOf(locators.technoLogo));
        Assert.assertTrue(locators.technoLogo.isDisplayed(), "Techno Study logosu görünmüyor!");

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Tools.Wait(2);

        driver.navigate().back();
        wait.until(ExpectedConditions.visibilityOf(locators.courseAndroidApplication));

        wait.until(ExpectedConditions.visibilityOf(locators.dataScienceButton));
        locators.dataScienceButton.click();

        wait.until(ExpectedConditions.visibilityOf(locators.technoLogo));
        Assert.assertTrue(locators.technoLogo.isDisplayed(), "Techno Study logosu görünmüyor!");

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Tools.Wait(2);
    }

}


