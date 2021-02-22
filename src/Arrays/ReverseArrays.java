package Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int []
    }

    private static void reverseArray(int [] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength ; i++){
            int temp = array[i];
            array[i] = array[maxIndex - 1];
            array[maxIndex - 1] = temp;
        }

    }
}
