package com.sahdyk;

import java.util.Scanner;

// #13
public class Reading_Input {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        /* A scanner is needed to get input. This is
        part of the java.util.Scanner class and needs to be
        imported to work.
         */

        System.out.print("Age: ");
        byte age = kb.nextByte();
        System.out.println("You are " + age + " years old!");

        /*
        To get input, you have to write the scanner
        object, .next and whatever type of input.
            For Example:
                String input = kb.nextString();
                int input = kb.nextInt();
                byte input = kb.nextByte;
                etc...
         */

        System.out.print("Name: ");
        String name = kb.next();
        kb.nextLine(); // This is called right after to avoid skipping.
        System.out.println("Hello " + name + ", nice to meet you.");
        /*
        Each word in a string input is called a token.
        next() method only reads one token and therefore outputs
        only the first word regardless of if you entered multiple
        words.
        nextLine() method reads all the words.
         */
        System.out.print("Full name: ");
        String fullName = kb.nextLine().trim();
        System.out.println(fullName);
        /*
        Adding the trim method will remove any unwanted white
        space before and after the user input.
        You do this by chaining it with the nextLine() method.
            For example:
                kb.nextLine().trim();
         */
    }
}
