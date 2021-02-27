package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListMain {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryLists groceryLists = new GroceryLists();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0: printInstructions();
                break;
                case 1 :groceryLists.printGroceryList();
                break;
                case 2 : addItem();
                break;
                case 3 : removeItem();
                break;
                case 4 : modifyItem();
                break;
                case 5 :searchForItem();
                break;
                case 6 :quit = true;
                break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\n press");
        System.out.println("\t 0- To print choice options.");
        System.out.println("\t 1- To print the list of the grocery Item");
        System.out.println("\t 2- To add an Item to the list");
        System.out.println("\t 3- To modify an item on the list");
        System.out.println("\t 4- To remove an Item from the list");
        System.out.println("\t 5 - To To search for an item on the list");
        System.out.println("\t 6 - To quit the application");

    }

    public static void addItem(){
        System.out.print("Enter groceryItem to add to the List: ");
        groceryLists.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement Item: ");
        String newItem = scanner.nextLine();
        groceryLists.modifyItem(itemNo-1, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryLists.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem(){
        System.out.print("Enter item number to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryLists.findItem(searchItem) != null){
            System.out.println("found " + searchItem + " in our grocery list");
        }else{
            System.out.println(searchItem + " is not found in the list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryLists.getGroceryLists());

    }
}
