package com.sahdyk;
// #4
public class EscapeKeys {
    public static void main(String[] args){
        String message = "Hello World";
        System.out.println(message);
        String message2 = "Hello World \" mosh\" ";
        /* To add quotes in a string, add a backslash
        before the quote.
            For example:
                "My name is \" insert name \" ";
                ^ first quote: for actual string. This is for the code to work
                            ^ backslash: For code to escape
                             ^ Second quote: For user to see, outside user to see.
         */

        /* Other escape characters:
                \t = creates a tab space
                \n = creates a new line
                \\ = to add a backslash in the quote
         */
    }
}
