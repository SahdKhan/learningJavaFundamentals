package com.sahdyk;
// #8
public class Arithmetic_Expressions {
    public static void main(String[] args){
        int result = 10 / 3;
        System.out.println(result);
        /* This will result in a whole number because
        in java two whole numbers being divided will only produce
        whole numbers. To get a floating point number, you must
        convert the numbers to a float or double. To do this
        you must prefix the number with (double) or (float) which is known as casting
         */
        double result2 = (double)10 / (double)3;
        System.out.println(result2);
        // An expression is a piece of code that produces a value.

        int x = 1;
        x++;
        /* This increases the value of x by 1.
        You can do this by adding ++ after the variable or before.
        For example: x++
                     ++x
        If you want to increment/decrement something by 2
        you can do this by:
                    int x = 1;
                    x = x + 2;
                    x = x - 2;
                    x += 2;
                    x -= 2;
         */


    }
}
