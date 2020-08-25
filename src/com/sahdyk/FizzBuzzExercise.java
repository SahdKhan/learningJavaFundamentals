package com.sahdyk;

import java.util.Scanner;

// #20
public class FizzBuzzExercise {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Number: ");
        int number = kb.nextInt();

        // if (number % 5 == 0)
        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0){
            System.out.println("Fizz");
        } else if (number % 3 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
