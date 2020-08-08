package com.sahdyk;

import java.util.Arrays;
// #6
public class MultiDimensionalArrays {
    public static void main(String[] args){
        int[][] numbers = new int[2][3];
        /*  ^ ^ two brackets = multidimensional arrays
                                  ^  ^ = two on both sides
         */
        System.out.println(Arrays.toString(numbers));
        // This wont output correctly
        System.out.println(Arrays.deepToString(numbers));
        /* this will output correctly
        deepToString is used for multidimensional arrays
         */

        int[][][] threeDim = new int[2][3][5];
        /* This is a three dimensional array.
        You just add another bracket pair for a dimension
         */

        int[][] quickDimension = { {1,2,3}, {4,5,6} };
        /* this is a quick way of making a two dimensional array
        you just add the curly braces inside the curly braces
        along with a comma and then another pair of curly braces
         */

        System.out.println(Arrays.deepToString(quickDimension));
    }
}
