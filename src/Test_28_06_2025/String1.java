package Test_28_06_2025;

public class String1 {

         public static void main(String[] args) {

             String s1 = "Hello world";

             // Length of the string
             int length = s1.length();

             // First character
             char firstChar = s1.charAt(0);

             // Substring: Extracting "World" (case sensitive, so we use substring from index 6)
             String s2 = s1.substring(6); // "world"
             // Convert to "World"
             s2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);

             // Output
             System.out.println("Length: " + length);
             System.out.println("First char: " + firstChar);
             System.out.println("Substring: " + s2);

         }
}
