package Task;

import java.util.Scanner;

public class Task24may_Grade {
    public static void main(String[] args) {
        // Kids -> A -> Excellent, F -> Fail
        // Create a program that will basically be based on
        // the alphabet or based on the grade.
        // You will give the message to the kid if you got
        // excellent, very good, good, needs improvement,
        // fail, or invalid grade.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Grade:- ");
        String  g = scanner.next();
        g =g.toLowerCase();

        switch (g)
        {
            case "a":
            {
                System.out.println("Excellent");
                break;
            }
            case "b":
            {
                System.out.println("Very GOOD");
                break;
            }
            case "c":
            {
                System.out.println("Good");
                break;
            }
            case "d":
            {
                System.out.println("Need Improvement");
                break;
            }
            case "f":
            {
                System.out.println("fail");
                break;
            }
            //case "e","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z":
            default:
            {
                System.out.println("Invalid Grade");
                break;
            }
        }
    }
}
