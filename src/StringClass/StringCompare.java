package StringClass;

public class StringCompare {

    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = "good bye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1,s2,s3,s4);

        if(s1.equals("Hello")){
            System.out.println("s1 does equal \"Hello\"");
        }else{
            System.out.println("s1 does not equal \"Hello\"");
        }

        if(s1 == "Hello"){
            System.out.println("s1 is the same object as \"Hello\"");
        }else {
            System.out.println("s1 is not the same object \"Hello\"");
        }
    }
}
