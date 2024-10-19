package TechnoStudy;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.Set;

public class LogoToHomepage extends BaseDriverParameter {

    @Test(groups = {"Smoke Test"})
    @Parameters("browserTipi")
    public void LogoToHomepage() {

        POM locaters = new POM();
        driver.get("https://techno.study/tr");

        By[] clickableElements = {
                By.linkText("SDET-Yazılım Test Uzmanı"),
                By.xpath("//span[text()='Android Uygulama Geliştirme']"),
                By.xpath("//span[text()='Veri Bilimi']"),
                By.xpath("//span[text()='Job Center & Arbeitsamt']"),
                By.xpath("//a[text()='Kullanım Şartları']"),
                By.linkText("Gizlilik Politikası"),
                By.linkText("Çerez Poli"),

        };



        String homePage=driver.getWindowHandle();
        for (By elementLocator : clickableElements) {
            try {

                if( !elementLocator.equals(By.xpath("//a[text()='Kullanım Şartları']")) &&
                        !elementLocator.equals(By.linkText("Gizlilik Politikası")) &&
                        !elementLocator.equals(By.linkText("Çerez Poli"))) {
                    wait.until(ExpectedConditions.visibilityOf(locaters.menuCourses));
                    Actions action = new Actions(driver);
                    action.moveToElement(locaters.menuCourses).perform();
                    System.out.println("menu = "+elementLocator);
                    WebElement elementToClick = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
                    elementToClick.click();

                    locaters.checkAndClickLogo();
                }

                if(elementLocator.equals(By.xpath("//a[text()='Kullanım Şartları']"))||
                        elementLocator.equals(By.linkText("Gizlilik Politikası"))||
                        elementLocator.equals(By.linkText("Çerez Poli")))
                {

                    wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
                    WebElement elementToScroll = driver.findElement(elementLocator);
                    js.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);
                    System.out.println("element = "+elementLocator);
                    wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
                    WebElement elemenClick=driver.findElement(elementLocator);
                    js.executeScript("arguments[0].click()", elemenClick);

                    Set<String>windowAllWindows=driver.getWindowHandles();
                    for (String win :windowAllWindows){
                        driver.switchTo().window(win);

                    }

                    locaters.checkAndClickLogo();
                    driver.close();

                    driver.switchTo().window(homePage);
                    locaters.checkAndClickLogo();
                }

            } catch (NoSuchElementException e) {
                driver.navigate().to("https://techno.study/tr");

            }
        }

        softAssert.assertAll();
    }

}

