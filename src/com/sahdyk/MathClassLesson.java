package com.sahdyk;

// #11
public class MathClassLesson {
    public static void main(String[] args){
        int result = Math.round(1.1F);
        System.out.println(result);
        // rounds a floating point number to a whole number

        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);
        // ceiling rounds the number up to the nearest whole number

        int result3 = (int)Math.floor(1.1F);
        System.out.println(result3);
        // floor rounds the numbers down to the nearest whole numbers

        int result4 = Math.max(1,2);
        System.out.println(result4);
        // max finds the biggest number from the two

        int result5 = (int)(Math.random() * 100);
        System.out.println(result5);
        /*
        Math.random() = Random number between 0 and 1.
        if you want a random number from 0 to 100 for example,
        you would simply multiply that by 100.
                For example:
                    random number from 0 to 50 = Math.random() * 50;
                    random number from 0 to 100 = Math.random() * 100;
        If you don't want numbers after the decimal point you have to pass
        the Math.random() method to the Math.round() method. Doing that
        will give you a number with a zero after the decimal point. If you
        want the decimal gone completely you have to explicitly cast it to an int
        as learned before.
               For example:
                    int result = (int)Math.round(Math.random() * 100);
               An easier way:
                    int result = (int) (Math.random() * 100);
         */
    }
}
