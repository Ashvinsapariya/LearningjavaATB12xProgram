package Task;

import java.util.Scanner;

public class Task7may183 {
    public static void main(String[] args) {

        int i = 1;
        int j = 2;
        int k = 3;

        int m = i-- - j-- - k--;
      //  int m = 1-2-3

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);

        // 0 + 1+2

    }

    public static class Task19may_Triangle_Scanner {

        public static void main(String[] args) {

            System.out.println("Enter 1st side of Triangle:");
            Scanner scanner = new Scanner(System.in);
            int n1 = scanner.nextInt();

            System.out.println(" Enter 2nd side of Triangle:");
           // Scanner scanner = new Scanner(System.in);
            int n2 = scanner.nextInt();

            System.out.println(" Enter 3rd side of Triangle:");
            //Scanner scanner = new Scanner(System.in);
            int n3 = scanner.nextInt();

            if(n1==n2&&n2==n3)
            {
                System.out.println("Equilateral Triangle");
            } else if(n1==n2||n1==n3||n2==n3)
            {
                System.out.println("Isosceles Triangle");
            }
            else
            {
                System.out.println("Scalene Triangle");
            }


        }
    }
}
