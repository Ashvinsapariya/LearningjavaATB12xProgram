package Test_wrapper_05_07_2025;
import java.util.Scanner;

// Custom exception class

import java.util.Scanner;

// Simple custom exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = s1.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("InvalidAgeException: Age must be 18 or older");
            } else {
                System.out.println("Valid age: " + age);
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        s1.close();
    }
}
