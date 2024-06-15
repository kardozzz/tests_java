package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletedTests extends TestBase {

  @Test
  public void ContactDeletedTests() throws Exception {
      app.getContactHelper().returnContactPage();
      app.getContactHelper().selectContact();
      app.getContactHelper().deleteSelectContact();
      app.getContactHelper().acceptDeleteContact();
      app.logOutSystem();
  }

}

