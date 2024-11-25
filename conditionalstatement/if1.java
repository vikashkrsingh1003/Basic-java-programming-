// Q1:- comapare two number with the help of if conditional statement . 

import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("enter a number 1 :");
        n1 = sc.nextInt();

        System.out.println("Enter a number 2 :");
        n2 = sc.nextInt();
        if (n1 > n2)
            System.out.println("number 1 is grater ");
        if (n1 < n2)
            System.out.println("number 2 is grater ");
        if (n1 == n2)
            System.out.println("both are equal ");

    }
}
