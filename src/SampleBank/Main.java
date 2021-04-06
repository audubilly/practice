package SampleBank;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Goldman Sachs");

        bank.addBranch("surulere");
        bank.addCustomer("surulere","Adams",234.65);
        bank.addCustomer("surulere","luke",12.67);
        bank.addCustomer("surulere", "joan",54.09);
        bank.listCustomers("surulere",true);

        bank.addBranch("yaba");
        bank.addCustomerTransaction("yaba","joe",900.0);

        bank.listCustomers("yaba",true);


//        bank.getBranches();




















    }


}
