package Arrays;

import java.util.Scanner;

public class ResizingArrays {

    private static Scanner scanner = new Scanner(System.in);
   private static int [] baseData =  new int[10];


   public static void getInput(){
       for(int i = 0; i < baseData.length; i++){
           baseData[i] = scanner.nextInt();
           scanner.nextLine();
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
        for(int i = 0; i< original.length; i++){
            baseData[i] = original[i];
        }
    }

}
