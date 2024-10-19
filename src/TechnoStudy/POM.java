package TechnoStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class POM {

    WebDriverWait wait=new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(20));
    public POM() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(linkText = "Kurslar")
    public WebElement courseDropdown;

    @FindBy(xpath = "//nav[@class=\"t228__centercontainer\"]")
    public WebElement coursesDropdownn;

    @FindBy(xpath = "//span[contains(@class,'link-inner_left')]")
    public List<WebElement> courses;

    @FindBy(linkText = "SDET-Yazılım Test Uzmanı")
    public WebElement sdet;

    @FindBy(xpath = "//div[@data-elem-type='text']/h1")
    public WebElement controlTextSdet;

    @FindBy(xpath = "//*[contains(text(),'Yoğun Online Eğitim Kampı')]")
    public WebElement shortTextSdet;

    @FindBy(linkText = "Android Uygulama Geliştirme")
    public WebElement androidApp;

    @FindBy(xpath = "//div[@class='tn-atom']/p/strong")
    public WebElement controlTextAndroid;

    @FindBy(xpath = "//div[@data-elem-type='button']/a")
    public WebElement androidButton;

    @FindBy(xpath = "(//div[text()='Android Uygulama Geliştirme'])[1]")
    public WebElement shortTextAndroid;

    @FindBy(linkText = "Veri Bilimi")
    public WebElement dataScience;

    @FindBy(xpath = "//div[@data-field-top-value='50']/h2")
    public WebElement controlTextDataSci;

    @FindBy(xpath = "//a[text()='Detaylı bilgi']")
    public WebElement detailedInfoButton;

    @FindBy(xpath = "//div[.='Online Veri Bilimi Dersleri']")
    public WebElement shorTextData;

    @FindBy(linkText = "Job Center & Arbeitsamt")
    public WebElement jobCenter;

    @FindBy(css = "[data-field-left-value='554'] div")
    public WebElement jobCenterControlText;

    @FindBy(xpath = "(//div[contains(text(),'Techno Study')])[2]")
    public WebElement jobCenterShortText;

    @FindBy(xpath = "//*[text()='SDET']")
    public WebElement courseSDET;

    @FindBy(xpath = "(//*[text()='Detaylı bilgi'])[2]")
    public WebElement detailedInformationButton;

    @FindBy(xpath = "//*[text()='Şimdi Başvur']")
    public WebElement applyNowButton;

    @FindBy(css = "[class='tn-atom'] strong")
    public WebElement informationSDET;

    @FindBy(xpath = "//div[contains(@class,'leftcontainer')]//img")
    public WebElement technoLogo;

    @FindBy(xpath = "(//*[text()='BAŞVUR'])[2]")
    public WebElement homepageControl;

    @FindBy(xpath = "//*[text()='Android Uygulama Geliştiricisi']")
    public WebElement courseAndroidApplication;

    @FindBy(xpath = "(//*[text()='Detaylı bilgi'])[3]")
    public WebElement androidApplicationButton;

    @FindBy(xpath = "(//*[text()='Android Uygulama Geliştirme'])[3]")
    public WebElement androidApplicationText;

    @FindBy(xpath = "//*[text()='Detaylı bilgi']")
    public WebElement detailedButtonSecond;

    @FindBy(xpath = "(//p[@style='text-align: center;'])[4]")
    public WebElement informationField;

    @FindBy(xpath = "(//p[@style='text-align: center;'])[6]")
    public WebElement informationFieldSecond;

    @FindBy(xpath = "//*[.='Mezunlarımızı neler bekliyor?']")
    public WebElement informationFieldThird;

    @FindBy(xpath = "(//*[text()='Veri Bilimi'])[2]")
    public WebElement dataScience2;

    @FindBy(xpath = "//*[text()='Detaylı bilgi']")
    public WebElement dataScienceButton;

    @FindBy(xpath = "//*[text()='Detaylı bilgi']")
    public WebElement detailedButton;

    @FindBy(xpath = "//div[.='Online Veri Bilimi Dersleri']")
    public WebElement onlineText;

    @FindBy(xpath = "//*[.='Techno Study ile Veri Bilimci Olun']")
    public WebElement dataScienceContent;

    @FindBy (xpath = "//div[@data-elem-id='1702990889506']")
    public WebElement facebook;

    @FindBy (xpath = "//div[@data-elem-id='1702990962792']")
    public WebElement instagram;

    @FindBy (xpath = "//div[@data-elem-id='1702990970230']")
    public WebElement youtube;

    @FindBy (xpath = "//div[@data-elem-id='1702991074133']")
    public WebElement linkedin;

    @FindBy(xpath = "//span[@class='t-checkbox__labeltext']")
    public WebElement checkBoxFile;

    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement checkBox;

    @FindBy(xpath = "(//a[@href=\"https://campus.techno.study\"])[1]")
    public WebElement login;



    @FindBy(xpath = " //a[text()='BAŞVUR']")
    public WebElement applyBtn;

    @FindBy(xpath = " //input[@name='name']")
    public WebElement name;

    @FindBy(xpath = " //input[@name='email']")
    public WebElement email;

    @FindBy(xpath = " //div[@class='t-input-phonemask__select']//span")
    public WebElement phoneSelect;

    @FindBy(xpath = " //div[@id='t-phonemask_ar']")
    public WebElement countryCode;

    @FindBy(xpath = " //input[@type='tel']")
    public WebElement phoneNo;

    @FindBy(xpath = " //input[@name='Input']")
    public WebElement age;

    @FindBy(xpath = " //input[@name='Input_2']")
    public WebElement job;

    @FindBy(xpath = " //select[@name='country']")
    public WebElement educationStatus;

    @FindBy(xpath = " //select[@name='country_2']")
    public WebElement countryChoice;

    @FindBy(xpath = " //select[@name='course']")
    public WebElement courseChoice;

    @FindBy(xpath = " //select[@name='survey']")
    public WebElement surveyChoice;

    @FindBy(xpath = " //div[@class='t-checkbox__indicator']")
    public WebElement conditionBtn;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement toSendBtn;

    @FindBy(xpath = " //div[@id='tildaformsuccesspopuptext']//p/span")
    public WebElement applicationMassage;

    @FindBy(xpath = " (//a[text()='Kurslar'])[1]")
    public WebElement menuCourses;

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));

        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
    }

    public void checkAndClickLogo() {
        By logoSelector = By.cssSelector("img[alt='TechnoStudy']");

        WebElement logo = BaseDriver.driver.findElement(logoSelector);
        wait.until(ExpectedConditions.elementToBeClickable(logo));
        BaseDriver.softAssert.assertTrue(logo.isDisplayed(), "TechnoStudy logosu görüntülenemiyor.");
        logo.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='BAŞVUR']")));
        BaseDriver.softAssert.assertEquals(BaseDriver.driver.getCurrentUrl(), "https://techno.study/tr", "Logo'ya tıklanınca ana sayfaya yönlendirilmedi.");

    }


}