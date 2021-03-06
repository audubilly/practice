package Arrays;

import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
    getNumbers();
    }

    public static void getNumbers() {


        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

//        int count = 0;
        int entered = 0;
        int num = 0;

        while (entered< myArray.length) {
            System.out.println("Enter number:\r");
            num = input.nextInt();

            if (num < 10 || num > 100) {
                boolean digit = false;
                entered++;
            }
            int i;
            for (i = 0; i < myArray.length; i++) {
                if(myArray[i] == num){
                    boolean digit = true;
                }
            }
            
        }
    }


}
