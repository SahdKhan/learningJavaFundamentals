package com.sahdyk;
// #10
public class Casting {
    public static void main(String[] args){
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        /*
        Implicit Casting = Automatic casting/conversion.
        In this situation the short is automatically
        converted to an int because a short has 2 bytes
        and int has 4 which means the short can fit into the int.
        byte < short < int < long < float < double
         */

        double x2 = 1.1;
        double y2 = x2 + 2;
        /*
        Int is less precise than a double because in
        a double we can have digits after the decimal point.
        Java is automatically going to cast the int to a double.
        For example:
                    The 2 was converted to a 2.0.
                    2.0 + 1.1 = 3.1
         */

        /*
        EXPLICIT CASTING = Casting a number yourself. This is
        useful when you don't care about the numbers after the decimal.
        For example:
                AUTOMATIC CASTING: double x = 1.1;
                                   double y2 = x + 2;
                       change the type to double.
                EXPLICIT CASTING:   double x = 1.1;
                                    int y2 = (int)x + 2;
                       add the type in parenthesis before the variable.

            YOU CAN ONLY DO EXPLICIT CASTING WHEN THE VARIABLES ARE OF THE SAME TYPE.
            YOU CANT CAST A STRING TO A NUMBER.
         */
        String num = "4";
        int num2 = Integer.parseInt(num) + 2;
        System.out.println(num2);
        /*
        To convert a string to a number you have to parse.
                string to int = Integer.parseInt(string variable)
                string to float = Float.parseFloat(string variable)
                string to double = Double.parseDouble(string variable)
                and so on...
         */
    }
}
