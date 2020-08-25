package com.sahdyk;

import java.text.NumberFormat;

// #12
public class FormattingNumbers {
    public static void main(String[] args){
        /*
        Formatting 1234567 to have a $ before and
        a comma every 3 numbers.

        Formatting 0.1 to 10%

         */

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // This is called a factory method because it creates new objects.
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat discount = NumberFormat.getPercentInstance();
        String discountAmount = discount.format(0.1);
        System.out.println(discountAmount);

        NumberFormat.getPercentInstance().format(0.5);
        /*
        This is called METHOD CHAINING.
        method chaining = chaining methods together.
        This is good because it is less lines of code to do the same thing as above
        without creating a whole new object. You store the chained methods into
        a variable and output that variable.
         */

    }
}
