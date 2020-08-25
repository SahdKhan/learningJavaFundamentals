package com.sahdyk;

// #19
public class Switch_Statements {
    public static void main(String[] args){
        // IF STATEMENT
        String role = "admin";
        if (role == "admin"){
            System.out.println("You're an admin");
        } else if (role == "moderator"){
            System.out.println("You're a moderator");
        } else {
            System.out.println("You're a guest");
        }
        // SWITCH STATEMENT

        String role2 = "admin";

        switch (role2) {
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }
    }
}
