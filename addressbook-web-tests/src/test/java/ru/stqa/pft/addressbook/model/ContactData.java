package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstNameContact;
    private final String lastNameContact;
    private final String nickNameContact;
    private final String adressContact;
    private final String mobileContact;
    private final String emailContact;
    private final String bDayContact;
    private final String bMonthContact;
    private final String bYearContact;

    public ContactData(String firstNameContact, String lastNameContact, String nickNameContact, String adressContact, String mobileContact, String emailContact, String bDayContact, String bMonthContact, String bYearContact) {
        this.firstNameContact = firstNameContact;
        this.lastNameContact = lastNameContact;
        this.nickNameContact = nickNameContact;
        this.adressContact = adressContact;
        this.mobileContact = mobileContact;
        this.emailContact = emailContact;
        this.bDayContact = bDayContact;
        this.bMonthContact = bMonthContact;
        this.bYearContact = bYearContact;
    }

    public String getFirstNameContact() {
        return firstNameContact;
    }

    public String getLastNameContact() {
        return lastNameContact;
    }

    public String getNickNameContact() {
        return nickNameContact;
    }

    public String getAdressContact() {
        return adressContact;
    }

    public String getMobileContact() {
        return mobileContact;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public String getbDayContact() {
        return bDayContact;
    }

    public String getbMonthContact() {
        return bMonthContact;
    }

    public String getbYearContact() {
        return bYearContact;
    }
}
