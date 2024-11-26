/*  Write a program to accept a number and check whether it is a Spy Number or not.
 (A number is spy if the sum of its digits equals the product of its digits.) (example :- 22)*/

import java.util.Scanner;

class Q8 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        int m = n;
        while (n != 0) {

            int r = n % 10;

            sum = sum + r;
            prod = prod * r;

            n = n / 10;
        }

        if (sum == prod)
            System.out.println(sum + "=" + prod + " is Spy  number");
        else
            System.out.println(sum + "=" + prod + " is not Spy  number");
    }
}