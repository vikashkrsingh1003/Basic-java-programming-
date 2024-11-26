
// Q WAP TO PRINT MULTIPLE OF 3 AND 5 FROM 1 TON 60 USING WHILE , DO WHILE AND FOR LOOP ?
import java.util.Scanner;

public class L4 {
    public static void main(String args[]) {
        int i;
        // i = 1;
        /*
         * while (i<=60) {
         * if(i%3==0 && i%5 ==0){ // while loop
         * System.out.println(i);
         * }
         * i++;
         * }
         */
        /*
         * do {
         * if(i%3==0 && i%5 ==0){
         * System.out.println(i); // do while loop
         * i++;
         * } while (i <= 60);
         */

        for (i = 1; i <= 60; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // for loop
                System.out.println(i);
            }
        }
    }
}
