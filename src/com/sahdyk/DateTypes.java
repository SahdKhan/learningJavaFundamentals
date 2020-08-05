package com.sahdyk;

import java.util.Date;

public class DateTypes {

    public static void main(String[] args) {

        /* primitive type is used to store simple things such as:
         * numbers
         * characters
         * boolean
         * */

        long views = 3_123_456_789L;
        double price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        /* Reference type is used to store complex items such as:
         * data
         * mail message
         */

        byte age = 30;
        Date now = new Date();
        System.out.println(now);

    }
}
