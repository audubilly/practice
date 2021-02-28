package MobilephoneApp;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> contacts;
    

    public void storeContacts(Contacts info) {
        contacts.add(info);
    }

    public ArrayList<Contacts> getContact() {
        return contacts;
    }
}
