package Arrays;

import java.util.ArrayList;

public class GroceryLists {

    private ArrayList<String> groceryLists = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryLists.add(item);
    }

    public void printGroceryList(){
        System.out.println("you have " + groceryLists.size() + "items in your groceryList");
        for(int i = 0; i < groceryLists.size(); i++){
            System.out.println((i+1) + " ." + groceryLists.get(i));
        }
    }


}
