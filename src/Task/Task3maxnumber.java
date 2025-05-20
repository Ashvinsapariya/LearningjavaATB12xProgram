package Task;

public class Task3maxnumber {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 25;
        int n3 = 15;
        int n4 = 17;

        String number = (n1 > n2) ?
                        (n1 > n3 ? "Maximum number is n1 " : "Maximum number is n3")
                        : (n2 > n3 ? "Maximum number sis n2" : "Maximum number is n3");

//        String number = (n1 > n2)
//                ? (n1 > n3
//                ? (n1 > n4 ? "Maximum n1" : "Maximum n4") :(n3 > n4 ? "Maximum n3":"Maximum n4"))
//                : (n2 > n3 ? (n2 > n4 ? "Maximum n2" : "Maximum n4")
//                : (n3 > n4 ? "Maximum n3" : "Maximum n4"));


        System.out.println(number);
    }
}
