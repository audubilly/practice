import java.security.SecureRandom;

public class Arrays2 {

    public static void main(String[] args) {
        int[] barchart = {1, 0, 2, 2, 4, 5, 5, 4, 7, 4, 3};

//        System.out.println("Grade Distribution");
//
//        for (int counter = 0; counter < barchart.length; counter++) {
//            if (counter == 10) {
//                System.out.printf("%5d:", 1000);
//            } else {
//                System.out.printf("%02d-%02d", counter * 10, counter * 10 + 9);
//
//                for (int stars = 0; stars < barchart[counter]; stars++) ;
//                System.out.print("*");
//
//                System.out.println();

//
//            }
//        }


                SecureRandom randomNumbers = new SecureRandom();
                int[] frequency = new int[7];

                for (int roll = 1; roll <= 6000000; roll++)
                    ++frequency[1 + randomNumbers.nextInt(6)];

                System.out.printf("%s%10s%n", "Face", "Frequency");

                for (int face = 1; face < frequency.length; face++)
                    System.out.printf("%4d%10d%n", face, frequency[face]);


            }


        }

