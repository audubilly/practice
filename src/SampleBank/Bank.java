package SampleBank;

import java.util.ArrayList;

public class Bank {

    private  String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch == null){
        this.branches.add(new Branch(branchName));
        return true;
        }
        return false;
    }


    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
          return   branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

}
