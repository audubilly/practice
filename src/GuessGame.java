import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberOfTries;
        int low = 1;
        int high = 5;
        int checkingNumber;
        int result = random.nextInt(low + high) + low;

        System.out.println("lets play a guess game: ");
        System.out.println("select a number between 1 and 100: \n" );
        checkingNumber = scanner.nextInt();

        for (numberOfTries = 1; numberOfTries <= high; numberOfTries++) {
            if (checkingNumber == result) {
                System.out.println("the number is correct");
                System.out.println("you did a perfect guess");
                high = high/2;
                result = random.nextInt(low + high)+1;
                continue;

            } else if (checkingNumber < 1 || checkingNumber  > 5) {
                System.out.println("the number is too high, try again");
                System.out.println("the actual number is " + result);

            }else if(checkingNumber < result &&  numberOfTries < 5){
                System.out.println("your guess is too low");
//                System.out.println("the correct number is " + result);
            }else if(checkingNumber > result && numberOfTries < 5){
                System.out.println("your guess is too high");
//                System.out.println("the correct number is  " + result);
            }else if(checkingNumber < result && numberOfTries ==5){
                System.out.println("your guess is still too low");
                System.out.println("the correct number is " + result);
            }else if (checkingNumber > result && numberOfTries == 5){
                System.out.println("the guess is too high");
                System.out.println("the correct number is " + result);
            }

        }

    }
}