import java.util.Arrays;
import java.util.Scanner;

public class PassingMethodsToAnArray {



    private  static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int [] myIntArray = getIntegers(7);
        int [] sorted = sortArray(myIntArray);
        printArray(sorted);


        for(int i =0; i < myIntArray.length; i++){
            System.out.println("Element "+ i + " value entered "+ myIntArray[i]);
        }

        System.out.println(" the average is " + String.format("%.2f",getAverage(myIntArray)));

    }


    public static int[] getIntegers(int number) {
        System.out.println("enter " + number + " Integer values: " );
        int [] values = new int[number];

        for(int i = 0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("elements " + i + " contains " + array[i]);
        }
    }

    public static double getAverage(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = array[i];
        }
        return (double)sum / (double) array.length;
    }


    public static int[] sortArray(int [] array){
      int [] sortedArray = new int [array.length];
      for(int i = 0 ; i < array.length; i++){
          sortedArray[i] = array[i];
      }
      boolean flag = true;
      int temp;
      while(flag){
          flag = false;

          for (int i = 0; i < array.length -1 ; i++){
              if(sortedArray[i] < sortedArray[i + 1]){
                  temp = sortedArray[i];
                  sortedArray[i] = sortedArray[i + 1];
                  sortedArray[i + 1] = temp;
                  flag = true;
              }
          }
        }
            return sortedArray;
    }

}


