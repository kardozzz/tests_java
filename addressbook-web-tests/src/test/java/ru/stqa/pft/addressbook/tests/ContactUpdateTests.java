package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactUpdateTests extends TestBase {

    @Test
    public void testUpdateContact() {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().updateContact();
        app.getContactHelper().initContactInfo(new ContactData("Joe", "Barboro", "Jo", "Little Italy", "77223355", "joebarboro@gmail.com", "17", "July", "1939"));
        app.getContactHelper().completeUpdateContact();
    }

}

//    @Test
//    public void testUpdateContactTests() throws Exception {
//        driver.get("http://localhost/addressbook/");
//        driver.findElement(By.id("15")).click();
//        driver.findElement(By.xpath("//img[@alt='Edit']")).click();
//        driver.findElement(By.name("firstname")).click();
//        driver.findElement(By.name("firstname")).clear();
//        driver.findElement(By.name("firstname")).sendKeys("Smith228");
//        driver.findElement(By.name("middlename")).click();
//        driver.findElement(By.name("middlename")).clear();
//        driver.findElement(By.name("middlename")).sendKeys("Johnson");
//        driver.findElement(By.name("nickname")).click();
//        driver.findElement(By.name("nickname")).clear();
//        driver.findElement(By.name("nickname")).sendKeys("TestingSmith33");
//        driver.findElement(By.name("lastname")).click();
//        driver.findElement(By.name("lastname")).clear();
//        driver.findElement(By.name("lastname")).sendKeys("Testing22");
//        driver.findElement(By.name("company")).click();
//        driver.findElement(By.name("company")).clear();
//        driver.findElement(By.name("company")).sendKeys("Gazprom");
//        driver.findElement(By.name("title")).click();
//        driver.findElement(By.name("title")).clear();
//        driver.findElement(By.name("title")).sendKeys("qa-auto");
//        driver.findElement(By.name("address")).click();
//        driver.findElement(By.name("address")).clear();
//        driver.findElement(By.name("address")).sendKeys("Moscow");
//        driver.findElement(By.xpath("//form[@action='edit.php']")).click();
//        driver.findElement(By.name("home")).click();
//        driver.findElement(By.name("home")).clear();
//        driver.findElement(By.name("home")).sendKeys("Классный");
//        driver.findElement(By.name("mobile")).click();
//        driver.findElement(By.name("mobile")).clear();
//        driver.findElement(By.name("mobile")).sendKeys("89109100111");
//        driver.findElement(By.name("work")).click();
//        driver.findElement(By.name("work")).clear();
//        driver.findElement(By.name("work")).sendKeys("sber");
//        driver.findElement(By.name("byear")).click();
//        driver.findElement(By.name("byear")).clear();
//        driver.findElement(By.name("byear")).sendKeys("1995");
//        driver.findElement(By.name("bmonth")).click();
//        new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText("June");
//        driver.findElement(By.xpath("//option[@value='June']")).click();
//        driver.findElement(By.name("bday")).click();
//        new Select(driver.findElement(By.name("bday"))).selectByVisibleText("14");
//        driver.findElement(By.xpath("//option[@value='14']")).click();
//        driver.findElement(By.name("aday")).click();
//        new Select(driver.findElement(By.name("aday"))).selectByVisibleText("17");
//        driver.findElement(By.xpath("//div[@id='content']/form/select[3]/option[19]")).click();
//        driver.findElement(By.name("amonth")).click();
//        new Select(driver.findElement(By.name("amonth"))).selectByVisibleText("February");
//        driver.findElement(By.xpath("//option[@value='february']")).click();
//        driver.findElement(By.name("address2")).click();
//        driver.findElement(By.name("address2")).clear();
//        driver.findElement(By.name("address2")).sendKeys("Улица Пушкина");
//        driver.findElement(By.name("phone2")).click();
//        driver.findElement(By.name("phone2")).clear();
//        driver.findElement(By.name("phone2")).sendKeys("дом калатушкина");
//        driver.findElement(By.xpath("//div[@id='content']/form/input[22]")).click();
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void tearDown() throws Exception {
//        driver.quit();
//        String verificationErrorString = verificationErrors.toString();
//        if (!"".equals(verificationErrorString)) {
//            fail(verificationErrorString);
//        }
//    }
//
//    private boolean isElementPresent(By by) {
//        try {
//            driver.findElement(by);
//            return true;
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }
//
//    private boolean isAlertPresent() {
//        try {
//            driver.switchTo().alert();
//            return true;
//        } catch (NoAlertPresentException e) {
//            return false;
//        }
//    }
//
//    private String closeAlertAndGetItsText() {
//        try {
//            Alert alert = driver.switchTo().alert();
//            String alertText = alert.getText();
//            if (acceptNextAlert) {
//                alert.accept();
//            } else {
//                alert.dismiss();
//            }
//            return alertText;
//        } finally {
//            acceptNextAlert = true;
//        }
//    }

