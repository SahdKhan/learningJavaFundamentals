package com.sahdyk;

import java.util.Scanner;

// #14
public class MortgageProject {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = kb.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterest = kb.nextDouble();
        double monthlyRate = annualInterest / 12;
        System.out.println("Period (Years): ");
        int years = kb.nextInt();
        int months = years * 12;
        /*
        UNFINISHED
         */
    }
}
