package ex_04_Operators;

public class Lab041_Logical_Operators {

    public static void main(String[] args) {

        boolean d = true;
        System.out.println(!d); // means reverse

        boolean r = true;
        System.out.println(!!r);    // it's Reverse !

        boolean c = false || false;
        boolean c1 = true || false;
        boolean c2 = false || true;
        boolean c3 = true || true;

        System.out.println();
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println();

//        ✅ Logical OR (||) Truth Table
//        A (Condition 1)	B (Condition 2)	A || B (Result)
//        true	             true	           true
//        true	             false	           true
//        false	             true	           true
//        false	             false	           false
//
//        Rule: || returns true if at least one condition is true.

        boolean a= true && true;
        boolean a1= true && false;
        boolean a2= false && true;
        boolean a3= false && false;


        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

//        ✅ Logical AND (&&) Truth Table
//        A (Condition 1)	B (Condition 2)	A && B (Result)
//        true	         true	                  true
//        true	         false	                  false
//        false	         true	                  false
//        false	         false	                  false

        //      Rule: && returns true only if both conditions are true.


    }
}
