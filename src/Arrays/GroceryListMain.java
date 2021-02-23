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
                case 0 -> printInstruction;
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

}
