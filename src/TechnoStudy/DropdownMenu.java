package TechnoStudy;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Random;

public class DropdownMenu extends BaseDriver {
    @Test(groups = {"Smoke Test"})
    @Parameters("browserTipi")
    public void TC1_DropdownMenu() {
        POM locators = new POM();
        Random random = new Random();

        js.executeScript("arguments[0].click()", locators.coursesDropdownn);
        Assert.assertFalse(locators.courses.isEmpty(), "Kurslar listesi boş olmamalı.");

        for (WebElement course : locators.courses) {
            System.out.println("Kurs: " + course.getText());
        }

        int randomChoosing = random.nextInt(locators.courses.size());
        System.out.println("Rastgele Seçim: " + randomChoosing);

        WebElement selectedCourse = locators.courses.get(randomChoosing);
        System.out.println("Seçilen Kurs: " + selectedCourse.getText());
        selectedCourse.click();

        System.out.println("Başarılı yönlendirme: " + driver.getCurrentUrl());
    }
}
