package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {

    public static void main(String[] args) {



        String user_input = args[0];
        System.out.println(user_input);
      //  System.out.println(user_input instanceof String);

        int age = Integer.parseInt(user_input); // String to int convert
        System.out.println(age);
        String result = (age < 18) ? "minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
