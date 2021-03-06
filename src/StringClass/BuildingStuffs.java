package StringClass;

public class BuildingStuffs {

    public static void main(String[] args) {


        StringBuilder builder1 = new StringBuilder();

        StringBuilder builder2 = new StringBuilder("the world is yours");

        StringBuilder builder3 = new StringBuilder(10);


        System.out.printf("buffer1 = \"%s\"%n", builder1);
        System.out.printf("buffer2 = \"%s\"%n", builder2);
        System.out.printf("buffer3 = \"%s\"%n", builder3);
        System.out.println("**********************************");
//        System.out.println(builder1);
//        System.out.println(builder3);
//        System.out.println(builder1.append(builder2));


        StringBuilder buffer = new StringBuilder("hey young one, the world is yours");


        System.out.println("length is : "  + buffer.length());
        System.out.println("capacity is : " + buffer.capacity());
        System.out.println("the To string is: " + buffer.toString());

        buffer.ensureCapacity(50);
        System.out.println("ok capacity is : " + buffer.capacity());
        buffer.setLength(12);
        System.out.println("the new length is : " + buffer.length());
        System.out.println("new capacity is : " + buffer.capacity());
        System.out.println(buffer.reverse());


    }
}