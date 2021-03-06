package RegularExpressions;

public class Main {
    public static void main(String[] args) {
        String string = " i am so grateful for life.";
        System.out.println(string);
        String newString = string.replaceAll("i", "you");
        System.out.println(newString);

        String alphanumeric = "abcde162626snsbsytu2iu1yu1u";
        System.out.println(alphanumeric.replaceAll(".","y"));
        System.out.println(alphanumeric.replaceAll("^abcde", "xxx"));

        String text = "I am not angry about what you said";
        System.out.println(text);
        System.out.println("*****************************");

        String newText = string.replaceAll("I", "i");
        System.out.println(newText);

        String numerics = "avvsgshsjsudgdthdjdydudkdjfg";
       String newNumerics = numerics.toUpperCase();
        System.out.println(newNumerics);
    }
}
