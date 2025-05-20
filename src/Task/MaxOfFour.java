package Task;

public class MaxOfFour {

    public static void main(String[] args) {
        int n1 = 25, n2 = 42, n3 = 17, n4 = 56;

        // Step-by-step using ternary operator
        int max = (n1 > n2)
                ? (n1 > n3
                ? (n1 > n4 ? n1 : n4)
                : (n3 > n4 ? n3 : n4))
                : (n2 > n3
                ? (n2 > n4 ? n2 : n4)
                : (n3 > n4 ? n3 : n4));

        System.out.println("Maximum number is: " + max);
    }
}
