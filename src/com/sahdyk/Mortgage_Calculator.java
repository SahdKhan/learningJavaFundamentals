package com.sahdyk;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {

    public static void main(String[] args){
        int principle = (int)readNumber("Principle: ", 1000, 1_000_000);
        float annualInterest = (float)readNumber("Annual Interest: ", 1, 30);
        byte years = (byte)readNumber("Years: ", 1, 30);

        double mortgage = mortgageCalc(principle, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner kb = new Scanner(System.in);
        double value = 0;
        while(true) {
            System.out.print(prompt);
            value = kb.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + (int)min + " and " + (int)max);
        }
        return value;
    }

    public static double mortgageCalc(int principle, float annualInterest, byte years) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = principle *
                ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        return mortgage;
    }
    }