package ex_02_Java_Basics_Part2;

public class Lab015_Variables {
    public static void main(String[] args) {
        // ```
        // data_type variable_name =  variable_value
        //```
        byte age = 65;

        // byte -> data type - type of container
        //  age ->  variable_name |  identifier
        // = -> Assignment Operator ?
        // 65 -> Variable Value |  Literal

        age = 127;
        System.out.println(age);
         //if i am used value 128  java: incompatible types: possible lossy conversion from int to byte
        //⚠️ We need to use the container or the data type that basically consumes the maximum capacity.
    }

}
