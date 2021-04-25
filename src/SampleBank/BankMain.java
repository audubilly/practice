package SampleBank;

import java.util.LinkedList;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank("Goldman Sachs");
        Branch branch = new Branch("yaba");

        bank.addBranch("surulere");
        bank.addCustomer("surulere","Adams",234.65);
        bank.addCustomer("surulere","luke",12.67);
        bank.addCustomer("surulere", "joan",54.09);
        bank.listCustomers("surulere",true);

        bank.addBranch("yaba");
        bank.addBranch("sabo");
        bank.addBranch("Victoria Island");
        bank.addBranch("Ikotun");
        bank.addBranch("ikeja");
        bank.addCustomerTransaction("yaba","joe",900.0);

        bank.listCustomers("yaba",true);

        System.out.print(bank.toString());
//        System.out.print(branch.toString());



    }


}
