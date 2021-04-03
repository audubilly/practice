package SampleBank;

import java.util.ArrayList;

public class Customer {
    private  String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransactions(initialAmount);
    }

    public void addTransactions(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }


}
