package com.sahdyk;

// #17
public class IfStatements {
    public static void main(String[] args){
        int temperature = 45;

        if(temperature > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temperature < 30 && temperature > 20){
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }
        /* SIMPLIFYING IF STATEMENTS
            For Example:
         */
        int income = 120_000;
        boolean hasHighIncome;
        if (income > 100_000){
            hasHighIncome = true;
        } else {
            hasHighIncome = false;
        }
        /*
        Simplifying that statement ^ to
         */
        int income2 = 120_000;
        boolean hasHighIncome2 = (income2 > 100_000);
        // It's preferred to wrap condition in parenthesis
    }
}
