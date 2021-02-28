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

        if(s3.equalsIgnoreCase(s4)){
            System.out.printf("%s equals %s with case ignored%n", s3, s4);
        }else{
            System.out.println("s3 does not equal s4");
        }
        System.out.printf("%ns1.compareTo s2 is %d", s1.compareTo(s2));
        System.out.printf("%ns1.compareTo s1 is %d", s1.compareTo(s1));
        System.out.printf("%ns2.compareTo s1 is %d", s2.compareTo(s1));
        System.out.printf("%ns3.CompareTo s4 is %d", s3.compareTo(s4));



    }
}
