package Task;

public class Task4findage {

    public static void main(String[] args) {
        int age =15;
        String result = (age < 18) ? "Minor " : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);

    }

}
