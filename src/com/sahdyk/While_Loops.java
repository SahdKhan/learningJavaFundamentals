package com.sahdyk;

import java.util.Scanner;

// #22
public class While_Loops {
    public static void main(String[] args){
        for (int i = 5; i > 0; i--){
            System.out.println("Hello world! " + i);
        }

        /*
        For Loops are better if we know ahead
        of time how many loops we want to iterate
         */

        int i = 0;
        while (i > 0){
            System.out.println("Hello world! " + i);
            i--;
        }

        /*
        While loops are better if you don't know
        how many times you want the loop to iterate
        FOR EXAMPLE BELOW:
         */

        Scanner kb = new Scanner(System.in);
        String input = "";
        while (!input.equals ("quit")){
            System.out.println("Input: ");
            input = kb.next().toLowerCase();
            System.out.println(input);
        }

    }
}
