package Task;

import java.util.Scanner;

public class Task24may_Leap_Year {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Year");
//        int ye = scanner.nextInt();

        System.out.println("Enter the month number");
        int month_number= scanner.nextInt();
        System.out.println("Enter the year");
        int year = scanner.nextInt();

        switch (month_number){
            case 1,3,5,7,8,10,12 -> System.out.println("31 days");
            case 4,6,9,11 -> System.out.println("30 days");
            case 2 -> {
                if ((year%4==0)&&((year%100!=0))||(year%400==0))
                {
                    System.out.println("29 days");
                }
                else  {
                    System.out.println("28 days");
                }
            }
            default -> System.out.println("Entered invalid data");
        }



//        if ((ye%4==0)&&(ye%100!=0)||(ye%400==0))
//        {
//            System.out.println("Leap Year");
//        }
//
//        else
//        {
//            System.out.println("not leap");
//        }
//        if ((year%4==0)&&((year%100!=0))||(year%400==0)){
//            System.out.println("29 days");}
//        else  {
//            System.out.println("28 days");
//        }
    }

}



