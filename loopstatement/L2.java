
// Q Wap to print even number from 10 to 20 using while , do while or for loop?
import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        int n;
        n = 10;
        /*
         * while (n<=20) {
         * if (n%2==0){
         * System.out.println(n);   while loop
         * }
         * n++;
         * }
         */
        /*
         * do {
         * if (n%2==0){
         * System.out.println(n);    // do while loop
         * }
         * n++;
         * } while (n<=20);
         */
           
         for (n=10 ; n<=20; n++) {
            if (n%2==0){
                System.out.println(n);     // for loop
            }
         }
    }
}
