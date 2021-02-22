package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ResizingArrays {

    private static Scanner scanner = new Scanner(System.in);
   private static int [] baseData =  new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        getInput();
        printArray(baseData);
        System.out.println("this is the base array " + Arrays.toString(baseData));
        resizeArray();
//        baseData[10] = 45;
//        baseData[11] = 23;
//        baseData[12] = 76;
        System.out.println("this is the resized array " + Arrays.toString(baseData));
//
    }

   public static void getInput(){
       for(int i = 0; i < baseData.length; i++){
           baseData[i] = scanner.nextInt();
       }
   }

   public static void printArray(int [] array){
       for(int i= 0; i< array.length; i++){
           System.out.println(array[i] + " ");
           System.out.println();
       }
   }
    public static void resizeArray(){
        int [] original = baseData;
        baseData = new int[13];
        System.arraycopy(original, 0, baseData, 0, original.length);
    }

}
