package com.sahdyk;

public class Strings {

    public static void main(String[] args){
        System.out.println("Hello world");
        /* this is a string literal.
        it is a string that isn't stored.
        It is simply an output and that's it.
         */

        String message = "Hello World";
        System.out.println(message);
        /* With strings you can access all sorts
        of methods because String is a class.
        You can also add two strings together.
                For example:
                message.endsWith() checks if the string ends with a certain character
                this method returns a boolean value
                because it is a true or false question
         */

        System.out.println(message.endsWith("d"));

    }
}
