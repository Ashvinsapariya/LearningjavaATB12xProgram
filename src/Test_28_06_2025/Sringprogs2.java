package Test_28_06_2025;

public class Sringprogs2 {
    public static void main(String[] args) {

        String S1 = "Hello";
        String S2 = "hello";
        String S3 = "Hello";


        System.out.println("string1 == string2: " + (S1 == S2));
        System.out.println("string1 == string3: " + (S1 == S3));


        System.out.println("string1 equals string2: " + S1.equals(S2));
        System.out.println("string1 equals string3: " + S1.equals(S3));


        System.out.println("string1 equalsIgnoreCase string2: " + S1.equalsIgnoreCase(S2));


        System.out.println("string1.compareTo(string2): " + S1.compareTo(S2));
    }
}
