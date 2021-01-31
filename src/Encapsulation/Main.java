package Encapsulation;

public class Main {
    public static void main(String[] args) {


        Printer printer = new Printer("Hp", 50, true);
        System.out.println("initial page count is " + printer.getPagesPrinted());
        System.out.println("the number of printed pages is " + printer.incrementNumberOfPagesPrinted(20));
        System.out.println("the tonerRating is : " + printer.fillUpToner(20));
        System.out.println("the tonerRating is : " + printer.fillUpToner(30));
        System.out.println("the tonerRating is : " + printer.fillUpToner(1));

    }



}