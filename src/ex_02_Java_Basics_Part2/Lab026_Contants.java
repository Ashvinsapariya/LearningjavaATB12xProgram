package ex_02_Java_Basics_Part2;

public class Lab026_Contants
{
    public static void main(String[] args) {

        //instance and static variable value assign by jvm but local variable can not default value
        int ab= 10;
        System.out.println(ab);

        final int b = 10;
       // b=b+1; //java: cannot assign a value to final variable b

        System.out.println(b);

    }
}
