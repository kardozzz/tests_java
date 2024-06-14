package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().addNewContact();
    app.getContactHelper().initContactInfo(new ContactData("Smith", "Testing", "TestingSmith22", "Florida", "222111222334455", "mister-smith@gmail.com", "10", "July", "1990"));
    app.getContactHelper().inputCreateContact();
    app.gotoHomePageContact();
    app.logOutSystem();
  }

}
