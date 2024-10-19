package TechnoStudy;

import Utility.BaseDriverParameter;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Booking extends BaseDriverParameter {


    /*
   Test Case 3: Booking
1. Anasayfanın belirgin bir bölümünde "Başvur" veya "Apply" gibi bir buton bulunmalıdır.
2. "Başvur" butonuna tıkladığımda, başvuru formunun olduğu bir sayfaya yönlendirilmelidir.
3. Başvuru formunda gerekli bilgiler (ad, soyad, iletişim bilgileri, istenilen kurs, vb.) kolayca
doldurulabilir olmalıdır.
4. Environmentin test sonrasında temiz kalması için, ad-soyad ve email kısımlarında "test"
ibaresi mutlaka bulunmalıdır: "Test Ali Karaca" veya "test_a.karaca@gmail.com" gibi... ve
ülke olarak ANDORA seçilmelidir.
5. Başvuru formu doldurulduktan sonra, "Gönder" veya "Submit" butonuna tıkladığımda
başvurumun iletilmesi ve bir onay mesajı görüntülenmesi gerekmektedir.
    */

    @Test(groups = {"Smoke Test"})
    @Parameters("browserTipi")
    public void Booking(){
        POM loceters=new POM();

        driver.get("https://techno.study/tr/");

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
