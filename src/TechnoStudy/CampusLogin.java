package TechnoStudy;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CampusLogin extends BaseDriver {

    @Test(groups = {"Smoke Test"})
    public void CampusLogin() {

        POM locators = new POM();

        driver.get("https://techno.study/");

        wait.until(ExpectedConditions.elementToBeClickable(locators.login));
        locators.login.click();

        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://campus.techno.study/"),
                "Campuse giriş yapılamadı");

    }
}
