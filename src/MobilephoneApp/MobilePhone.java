package MobilephoneApp;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContacts(Contacts contacts) {
        if(findContact(contacts.getName()) >= 0){
            System.out.println("contact already exists");
            return false;
        }
      myContacts.add(contacts);
        return true;

    }

    private int findContact(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }

    private int findContact(String contactName){
        for (int i = 0 ; i < this.myContacts.size(); i++){
            Contacts contacts = this.myContacts.get(i);
            if(contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Contacts> getContact() {
        return myContacts;
    }


}
