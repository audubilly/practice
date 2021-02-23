package Arrays;

import java.util.Scanner;

public class GroceryListMain {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryLists groceryLists = new GroceryLists();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0 -> printInstructions();
                break;
                case 1 -> groceryLists.printGroceryList();
                break;
                case 2 -> addItem();
                break;
                case 3 -> removeItem(0);
                break;
                case 4 -> modifyitem();
                break;
                case 5 -> serachForItem();
                break;
                case 6 -> quit = true;
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
        System.out.println("Enter groceryItem to add to the List: ");
        groceryLists.addGroceryItem(scanner.nextLine());
    }

}
