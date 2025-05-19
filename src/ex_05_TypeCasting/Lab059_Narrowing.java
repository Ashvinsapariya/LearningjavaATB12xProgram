package ex_05_TypeCasting;

public class Lab059_Narrowing {
    public static void main(String[] args) {

    int a = 903;
    // byte b =a; // Narrowing - Implicit JVM to do it. - Data loss will be there.
    byte b1 = (byte) a;// Narrowing - EXPLICIT JVM to do it. - Data loss will be there.
       System.out.println(b1); //-121

        //number convert into binary number
        // how much store into binary to decimal number
    }
}
