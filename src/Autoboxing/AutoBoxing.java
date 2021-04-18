package Autoboxing;

import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {


        ArrayList<Integer> myInt = new ArrayList<>();
        myInt.add(54);
        Integer integer = 45;

        for(int i = 0; i <= 10; i++){
            myInt.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++){
            System.out.println(i + " --> "+  myInt.get(i).intValue());
        }

        ArrayList<String> myString = new ArrayList<>();
        myString.add(0,"june");
        myString.add(1,"junior");
        myString.add(2,"james");
        System.out.println(myString);
        System.out.println("********************************");
        System.out.println(myString.add(String.valueOf(myString)));

    }


}
