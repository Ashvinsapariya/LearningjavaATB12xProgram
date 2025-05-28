package ex_09_Switch;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab084_Switch {


    public static void main(String[] args) {

        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.

        // Logic Building Formula

        // Step 1 - Number one is using the Scanner class.
        // Step 2 number two will be basically figuring out the expression and the day.
        // Step 3- We will basically add step 3 as a rough logic.
        // Step 4 - 4 is you will write the fix the logic and optimize.
        // Step 5 - figure out the edge cases.

        //Step 1

        Scanner scanner = new Scanner(System.in);


        try {

            System.out.println("Enter the day to 1 to 7");
            int day = scanner.nextInt();


            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("Enter int number from 1 to 7 only, you fool!");
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid input! Please enter an integer number.");
        } finally {
            scanner.close(); // Clean up resources
        }



    }
}
