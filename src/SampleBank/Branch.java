package SampleBank;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(name,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransactions(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0 ; i < this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;

            }
        }
        return null;
    }



    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
