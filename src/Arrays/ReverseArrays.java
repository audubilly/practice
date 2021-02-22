package Arrays;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int [] myArray = {68,45,70,76,90,22,50};
        System.out.println("the array is " + Arrays.toString(myArray));
         reverseArray(myArray);
        System.out.println("the reversed array is " + Arrays.toString(myArray));
    }

    private static void reverseArray(int [] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength ; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

    }
}
