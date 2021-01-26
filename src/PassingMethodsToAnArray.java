import java.util.Scanner;

public class PassingMethodsToAnArray {



    private  static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int [] myIntArray = getIntegers(7);
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

    public static double getAverage(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = array[i];
        }
        return (double)sum / (double) array.length;
    }

}


