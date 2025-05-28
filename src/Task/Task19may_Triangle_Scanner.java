package Task;
import java.util.Scanner;

public class Task19may_Triangle_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st side of Triangle:");
        int n1 = scanner.nextInt();
       // Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2nd side of Triangle:");
        int n2 = scanner.nextInt();
      //  Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3rd side of Triangle:");
        int n3 = scanner.nextInt();
      //  Scanner scanner = new Scanner(System.in);

        if (n1 == n2 && n2 == n3) {
            System.out.println("Equilateral Triangle");
        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }


    }
}
