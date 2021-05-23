import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        int numberToGuess;
        boolean win = false;
        int numberOfTries= 0;
        Random random = new Random();
        numberToGuess = random.nextInt(10) +1;
        Scanner scanner = new Scanner(System.in);
        int guess;

        while (win == false){
            System.out.println("Guess a number btw 1 and 10: ");
            guess = scanner.nextInt();
          numberOfTries++;

        if(guess== numberToGuess){
            win = true;
        }else if(guess < numberToGuess){
            System.out.println("you guessed too low");
        }else if(guess > numberToGuess){
            System.out.println("you guessed to high");
        }

        }
        System.out.println("you win");
        System.out.println("the number was " + numberToGuess);
        System.out.println("it took you " + numberOfTries + " attempts to get it right");
    }

    }