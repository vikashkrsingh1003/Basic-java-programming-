/*. A special two-digit number is such that when the sum of its digits is added to the product of 
its digits, the result is equal to the original two-digit number. ex - 59*/

import java.util.Scanner;

class Q9 {

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
        int result = sum + prod;
        if (result == m)
            System.out.println(result + " Special two digit number ");
        else
            System.out.println(result + " Not a special two digit number ");
    }
}