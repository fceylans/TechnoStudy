package TechnoStudy;

import Utility.BaseDriverParameter;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Booking extends BaseDriverParameter {

    @Test(groups = {"Smoke Test"})
    @Parameters("browserTipi")
    public void Booking(){
        POM loceters=new POM();

        wait.until(ExpectedConditions.elementToBeClickable(loceters.applyBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(loceters.name)).sendKeys("testFake User");
        wait.until(ExpectedConditions.visibilityOf(loceters.email)).sendKeys("testTeam4@hotmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(loceters.phoneSelect)).click();
        wait.until(ExpectedConditions.elementToBeClickable(loceters.countryCode)).click();
        wait.until(ExpectedConditions.elementToBeClickable(loceters.phoneNo)).sendKeys("5555555555");
        wait.until(ExpectedConditions.elementToBeClickable(loceters.age)).sendKeys("23");
        wait.until(ExpectedConditions.elementToBeClickable(loceters.job)).sendKeys("Tester");
        wait.until(ExpectedConditions.elementToBeClickable(loceters.educationStatus));
        Select educationStatusSelect =new Select(loceters.educationStatus);
        educationStatusSelect.selectByVisibleText("Üniversite");
        wait.until(ExpectedConditions.elementToBeClickable(loceters.countryChoice));
        Select countrySelect=new Select(loceters.countryChoice);
        countrySelect.selectByVisibleText("Argentina");
        wait.until(ExpectedConditions.elementToBeClickable(loceters.courseChoice));
        Select courseSelect=new Select(loceters.courseChoice);
        courseSelect.selectByVisibleText("SDET Türkçe");
        wait.until(ExpectedConditions.elementToBeClickable(loceters.surveyChoice));
        Select surveySelect=new Select(loceters.surveyChoice);
        surveySelect.selectByVisibleText("Instagram");
        wait.until(ExpectedConditions.elementToBeClickable(loceters.conditionBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(loceters.toSendBtn)).click();
        loceters.verifyContainsText(loceters.applicationMassage,"Başvurunuz alınmıştır. Bilgilendirme emailinize gönderilmiştir.");




        Tools.Wait(3);

    }
}
