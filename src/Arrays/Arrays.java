package Arrays;

import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int [capacity];
        System.out.println("Enter" + capacity +"Integer values:\r");
        for(int i = 0; i <= array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int [] array){
        for(int i = 0; i <= array.length; i++){
            array[i] =
        }
    }

}