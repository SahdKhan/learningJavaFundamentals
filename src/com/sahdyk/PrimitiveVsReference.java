package com.sahdyk;

import java.awt.Point;

public class PrimitiveVsReference {
// #2
    public static void main(String[] args){
        byte x = 1;
        byte y = x;
        x = 2;
        /* y will remain 1 because X and Y are completely
        independent of each other. For example, once y was told
        that the value of it will be 1(value of x) that's it. That
        is all that Y knows of itself, it doesn't know whats happening
        to X.Using pointers will change the value of Y.
        */

        Point point1 = new Point(1,1);
        /* When line 18 is run, the system will allocate some memory
        to create an address to hold the value, in this example the
        system creates an address for Point and that address hold x:1, y:2
         */
        Point point2 = point1;

        /* Reference hold the address of the point object in the memory
        NOT the actual value or content. For example, point2 address contains
        the address of point1, NOT x:1, y:2.
        Primitive data would have contained x:1, y:2.
         */

        point1.x = 2;
        //changed value of x in pointer1

        System.out.println(point2);
        /* The change is visible because both POINT1 and POINT2
        can see the address and therefore being able to see what
        is happening to the contents inside the address
         */
    }
}
