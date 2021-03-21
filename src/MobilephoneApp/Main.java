package MobilephoneApp;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static  MobilePhone mobilePhone =new MobilePhone("09056790444");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\n Enter action: (6 to print actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\n Shutting down......");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContacts();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    queryContacts();
                    break;
                case 6:
                    printActions();
                    break;


            }
        }
    }
    private static void updateContacts(){
        System.out.println("Enter existing contacts: ");
        String name = scanner.nextLine();
        Contacts existingContactRecords = mobilePhone.queryContacts(name);
        if(existingContactRecords == null){
            System.out.println("contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phoneNumber: ");
        String newNumber = scanner.nextLine();
        Contacts newContacts = Contacts.createContacts(newName,newNumber);
        if (mobilePhone.updateContact(existingContactRecords, newContacts)) {
            System.out.println("Successfully updated");
        }else{
            System.out.println("Error updating contact");
        }
    }

    private static void removeContacts() {
        System.out.println("Enter existing contacts: ");
        String name = scanner.nextLine();
        Contacts existingContactRecords = mobilePhone.queryContacts(name);
        if (existingContactRecords == null) {
            System.out.println("contact not found");
            return;
        }
       if(mobilePhone.removeContact(existingContactRecords)){
           System.out.println("Contact successfully removed");
       }else {
           System.out.println("Error removing contacts");
       }
    }
    private static void queryContacts() {
        System.out.println("Enter existing contacts: ");
        String name = scanner.nextLine();
        Contacts existingContactRecords = mobilePhone.queryContacts(name);
        if (existingContactRecords == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("Name: " +existingContactRecords.getName() + "phoneNumber " + existingContactRecords.getPhoneNumber());
        }


    private static void addNewContacts(){
        System.out.println("Enter contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone Number: ");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContacts(name , phoneNumber);
        if(mobilePhone.addNewContacts(newContact)){
            System.out.println("New contact added: Name: " + name + " ,phone Number: " + phoneNumber);
        }else {
            System.out.println("Contact " + name + " Already exists on phone");
        }
    }

    private static  void startPhone(){
        System.out.println("Starting phone .....");
    }

    private static void printActions(){
        System.out.println("\nAvailable options: \n Press");
        System.out.println("0 - to ShutDown\n" +
                            "1 - to Print Contacts\n" +
                            "2 - to Add a new Contact\n" +
                            "3 - to update existing contacts\n" +
                            "4 - to remove existing contacts\n" +
                            "5 - to query if a contact exists" +
                            "6 - to print a list of existing contacts");
        System.out.println("Choose an option: ");

    }
}

