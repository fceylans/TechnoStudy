package TechnoStudy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.BaseDriver;

public class POM {

    public POM() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(linkText = "Kurslar")
    public WebElement courseDropdown;

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
}