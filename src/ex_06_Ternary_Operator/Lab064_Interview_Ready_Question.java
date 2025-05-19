package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {


    public static void main(String[] args) {


       int age =21;
       String result = (age  > 18) ? (age > 25 ? "you can drive" : "you can't ") :  "you can goa";

       // String result = (number > 18) ? (number > 25 ? "In Goa, You can drink" : "You can't Drink") : "You can't go GOA";
        System.out.println(result);

    }
}
