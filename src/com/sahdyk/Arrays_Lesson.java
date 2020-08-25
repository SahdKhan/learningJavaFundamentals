package com.sahdyk;
import java.util.Arrays;

public class Arrays_Lesson {
// #5
    public static void main(String[] args){
        int[] numbers = new int[5];
        /* arrays are a reference type so we need
        to make a new array after declaring the type
        To make an array, use [].
         */
        numbers[0] = 1;
        numbers[1] = 2;
        /* to access arrays, write the number of the spot in
        brackets. Index start with 0.
         */
        System.out.println(numbers);
        /* this will output a weird string because
        it outputs something like the address where the memory
        is stored.
         */
        /* Arrays.toString(numbers);
        THIS CONVERTS AN ARRAY TO STRING
         */
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {5, 2, 10, 25, 15};
        /* This is a quicker way to make an array.
        This is useful if you already know the values of the array.
        You can find the length of an array using:
        numbers2.length;
        You can sort an array from low to high by using:
        Arrays.sort(numbers2);
         */

    }
}
