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
        mobilePhone = new MobilePhone("09056790444");
        contacts = new Contacts("james", "09056780444");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatContactsCanBeStoredOnAMobilePhone() {
        ArrayList<String> contacts = new ArrayList<>();
        assertEquals(0, contacts.size());
    }

    @Test
    void testThatContactsCanBeAddedToTheMobilePhone(){
        contacts = new Contacts("sule","09045672884");
        mobilePhone.addNewContacts(contacts);
        assertEquals(1,mobilePhone.getContact());

    }

}