package ex_02_Java_Basics_Part2;

public class Lab024_printF {

    public static void main(String[] args) {
        int a = 15;
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        System.out.println(a);
        System.out.printf("your value is %d", a);
        System.out.println();
        int b = 28;
        System.out.printf("First Value is %d, Second Value is %d", a, b);
        System.out.println();
        System.out.printf("a value is %d , b value is %d", a, b);
        System.out.println();
        System.out.printf("a = %d , b = %d",a,b);
        System.out.println();

        System.out.println("a = "+ a + " , b = " + b);

    }
}