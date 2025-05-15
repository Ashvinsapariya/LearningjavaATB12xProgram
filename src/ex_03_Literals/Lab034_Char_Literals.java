package ex_03_Literals;

public class Lab034_Char_Literals {
    public static void main(String[] args) {


        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
//        char c = "A"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("AshvinSapariya");
        System.out.println("Ashvin"+ new_line + "Sapariya");
        System.out.println("Ashvin"+ tab_line + "Sapariya");
        System.out.println("Ashvin"+ back_space + "Sapariya");
        System.out.println("Ashvin"+ carriage_return + "Sapariya");

        System.out.println("Hi This is first line" + new_line + "This is second line \n this this Thord line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f61'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';

    }
}
