package ex_06_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {

        int n1=10;
        int n2=3;
        int n3= 6;
        int n4=8;

        // input -> int
        // output -> String -> even or odd

        // Step 2 ->
        //  (n1>n2 ) --> True : False  (if true then check new condition) n1
      //  (n1>n3 ) ---> True and False (if true then check new condition)n1
        // (n2 > n3) ---> True n2 and False n3

        // Step 2 ->
        //  (n1>n2 ) --> True : False  (if true then check new condition) n1
        //  (n1>n3 ) ---> True and False (if true then check new condition)n1
        // (n1>n4) ---> True and False (if true then check new condition)n1

        //(n2>n3)--> True : False  (if true then check new condition) n2
        //(n2>n4)--> True : False  (if true then check new condition) n2

        //(n3>n4) -- ---> True n3 and False n4

      //  int result = (n1 > n2) ? (n1 > n3)? n1: n3 :((n2 > n3)? n2 : n3);

        int result =(n1 > n2)
                ? ((n1 >n3)
                ? (n1 > n4 ? n1 : n4)
                 :(n3 > n4 ? n3 : n4))

                  :((n2 > n3)
                ?(n2 > n4 ? n2 : n4)
                :(n3 > n4 ? n3: n4));
        System.out.println(result);


        int result1 = (n1 > n2)
                ? ((n1 > n3)
                ? (n1 > n4 ? n1 : n4)
                : (n3 > n4 ? n3 : n4))
                : ((n2 > n3)
                ? (n2 > n4 ? n2 : n4)
                : (n3 > n4 ? n3 : n4));

        System.out.println("Maximum number is: " + result1);








    }
}
