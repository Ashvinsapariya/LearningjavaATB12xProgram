package Test_wrapper_05_07_2025;
import java.util.Scanner;
public class Divisiontcx {


        public static void main(String[] args) {
            Scanner s1 = new Scanner(System.in);

            System.out.print("Enter first number ");
            int a = s1.nextInt();

            System.out.print("Enter second number: ");
            int b = s1.nextInt();

            try {
                int result = a / b;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero");
            } finally {
                System.out.println("Finally block executed");
            }

            sc.close();
        }
    }

