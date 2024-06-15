package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.testng.Assert.assertTrue;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void initContactInfo(ContactData contactData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstNameContact());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(contactData.getLastNameContact());
      wd.findElement(By.name("nickname")).click();
      wd.findElement(By.name("nickname")).clear();
      wd.findElement(By.name("nickname")).sendKeys(contactData.getNickNameContact());
      wd.findElement(By.name("address")).click();
      wd.findElement(By.name("address")).clear();
      wd.findElement(By.name("address")).sendKeys(contactData.getAdressContact());
      wd.findElement(By.name("mobile")).click();
      wd.findElement(By.name("mobile")).clear();
      wd.findElement(By.name("mobile")).sendKeys(contactData.getMobileContact());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(contactData.getEmailContact());
      wd.findElement(By.name("bday")).click();
      new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getbDayContact());
      wd.findElement(By.xpath("//option[@value='10']")).click();
      wd.findElement(By.name("bmonth")).click();
      new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getbMonthContact());
      wd.findElement(By.xpath("//option[@value='July']")).click();
      wd.findElement(By.name("byear")).click();
      wd.findElement(By.name("byear")).clear();
      wd.findElement(By.name("byear")).sendKeys(contactData.getbYearContact());
    }

    public void inputCreateContact() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void addNewContact() {
      wd.findElement(By.linkText("add new")).click();
    }

    public void deleteSelectContact() {
        wd.findElement(By.xpath("//input[@value='Delete']")).click();
    }


    public void acceptDeleteContact(){
        wd.switchTo().alert().accept();
    }
    public void returnContactPage() {
        wd.findElement(By.linkText("home")).click();
    }
    public void updateContact(){
        wd.findElement(By.xpath("//img[@alt='Edit']")).click();
    }
    public void completeUpdateContact(){
        wd.findElement(By.xpath("//div[@id='content']/form/input[22]")).click();
    }

    public void selectContact() {
        wd.findElement(By.name("selected[]")).click();
    }
}
