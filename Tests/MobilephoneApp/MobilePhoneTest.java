package MobilephoneApp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTest {
    MobilePhone mobilePhone;
    Contacts contacts;

    @BeforeEach
    void setUp() {
        mobilePhone = new MobilePhone();
        contacts = new Contacts("james","09056780444");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void tesThatContactsCanBeStoredOnAMobilePhone(){
      ArrayList<String> contacts = new ArrayList<>();
        assertEquals(0,contacts.size());


    }

//    @Test
//    void storeContacts() {
//    }
//
//    @Test
//    void getContact() {
//    }
}