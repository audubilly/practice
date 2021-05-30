package DSA;

public class Update {

    int counter = 0;
    int total;

    public void sum(int[] array) {
        for (int number : array) {
            total += number;
            System.out.println("added element" + counter);
            counter++;
        }
    }

    public int getTotal() {
        return total;
    }

    public int search(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Travelled through " + i);
            if (array[i] == number)
                return i;
        }
        return -1;
    }

    public int[] insert(int[] array, int numberToInsert, int position) {

        int newLength = array.length + 1;

        int[] newArray = new int[newLength];

        int counter = 0;

        for (int i = 0; i < newLength; i++) {
            if (position == i) {
                newArray[i] = numberToInsert;
            } else {
                newArray[i] = array[counter];
                counter++;
            }
        }
        array = newArray;
        return array;

    }

    public int[] delete(int[] array, int numberToDelete) {

        int [] newArray = new int[array.length-1];
        int counter =0;
        for(int i =0; i< array.length; i++){
            if(array[i] == numberToDelete){
                continue;
            }
            newArray[counter] = array[i];
            counter++;
        }
        return newArray;
    }
}
