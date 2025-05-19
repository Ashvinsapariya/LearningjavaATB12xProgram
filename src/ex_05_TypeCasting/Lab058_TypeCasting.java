package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a1 = (int)b; // Widening Explicit Casting (int) - optional (manually assign variable to compile)
       // System.out.println(a);
        System.out.println(a1);

    }
}
