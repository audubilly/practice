package StringClass;

public class BuildingStuffs {

    public static void main(String[] args) {


        StringBuilder builder1 = new StringBuilder();

        StringBuilder builder2 = new StringBuilder("the world is yours");

        StringBuilder builder3 = new StringBuilder(10);


        System.out.printf("buffer1 = \"%s\"%n", builder1);
        System.out.printf("buffer2 = \"%s\"%n", builder2);
        System.out.printf("buffer3 = \"%s\"%n", builder3);
        System.out.println(builder1);
        System.out.println(builder3);
//        System.out.println(builder1.append(builder2));



    }
}