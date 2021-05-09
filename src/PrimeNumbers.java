import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number: ");
        number = scanner.nextInt();
        System.out.println("checking to see if "+ number + " is a prime number. (true/false)");
        System.out.println(isPrime(number));


        generatePrimeNumbers(100);
    }

    public static boolean isPrime(int number){
        for(int i = 2; i <= number/2 ; i++){
            if(number%i == 0){
                System.out.println(number + " is not a Prime number");
                return false;
            }
        }
        System.out.println(number + " is a prime number");
        return true;
    }


    public static void generatePrimeNumbers(int upperLimit){
        System.out.println("Generating all the prime numbers from 2 to " + upperLimit);
        for(int i = 2 ; i < upperLimit ; i++){
            boolean isPrime = true;
            for(int j = 2; j< i ;j++ ){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
           if(isPrime)
            System.out.print( i + ",");
        }

    }
}
