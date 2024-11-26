/*. Write a program to input a number. Check and display
whether it is a Niven number or not. (A number is said to be
Niven which is divisible by the sum of its digits).
example :- 126 */
import java.util.Scanner;

class Q7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int m = n;
        while (n != 0) {

            int r = n % 10;

            sum = sum + r;

            n = n / 10;
        }
        if (m % sum == 0)
            System.out.println(m + " is niven  number");
        else
            System.out.println(m + " is not niven  number");
    }
}