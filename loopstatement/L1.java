// write a program to print number from 1 to 5 with using while ,do while  or for loop ?

import java.util.Scanner;

public class L1 {
    public static void main(String agrs[]) {
        int a;
        /*
         * a = 1;// initialization
         * while (a <= 5) { // test condition      // while loop
         * System.out.println(a);
         * a++; // increment
         * }
         */
        /* 
         * a=1; // intialization 
         * do {
         * System.out.println(a);      // do while loop
         * a++; // increment 
         * } while (a<=5); // test condition 
         */

        for (a = 1; a <= 5; a++) {
            System.out.println(a);       // for loop
        }
    }
}
