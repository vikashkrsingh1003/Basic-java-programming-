//WAp to check given number is stronmg or not ?

import java.util.Scanner;

class P3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter a any number ");
    int n = sc.nextInt();
    int sum = 0;
    int m = n;
    int fact;

    while (n != 0) {
      int r = n % 10;

      fact = 1;
      for (int i = r; i >= 1; i--) {
        fact = fact * i;
      }
      sum = sum + fact;
      n = n / 10;
    }

    if (m == sum) {
      System.out.println(" This is strong number  ");
    } else {
      System.out.println("This is not a strong number ");
    }
  }
}
