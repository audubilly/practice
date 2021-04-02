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
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("contact already exists");
            return false;
        }
        myContacts.add(contacts);
        return true;

    }

    public boolean removeContact(Contacts contacts) {
        int foundPosition = findContact(contacts);
        if (foundPosition < 0) {
            System.out.println(contacts.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contacts.getName() + " was deleted");
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

    public boolean updateContact(Contacts oldContact, Contacts newContacts){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0 ){
            System.out.println(oldContact.getName() + " was not found");
        }else if(findContact(newContacts.getName()) != -1){
            System.out.println("Contact with the name " + newContacts.getName() + "already exists on file. update was not successful");
        }
        this.myContacts.set(foundPosition , newContacts);
        System.out.println(oldContact.getName() + ", was replaced with " + newContacts.getName() +".");
        return true;
    }

    public String queryContact(Contacts contacts){
        if(findContact(contacts) >= 0){
            return contacts.getName();
        }
        return null;
    }
    public Contacts queryContacts(String name){
        int position = findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public ArrayList<Contacts> getContact() {
        return myContacts;
    }

    public void printContacts(){
        System.out.println("Contact Lists");
        for(int i = 0; i<this.myContacts.size(); i++){
            System.out.println((i+1) + "."+ this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }


}
