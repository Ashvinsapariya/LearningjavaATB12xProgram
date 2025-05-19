package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long lt = 88668909030l;
      //  short s = l; // Narrowing Explicit not possible
        short s1 = (short) lt;

        System.out.println(s1);


//        long phone_no = 9876543210l;
////        short s = phone_no; // Narrowing - implicit
//        short s = (short) phone_no; // Narrowing - Explicit
//        System.out.println(s); // 5866

    }
}
