// Wap to check given number is perfect or not ?

import java.util.Scanner;

class Loop2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum = sum + i;
      }
    }
    if (n == sum) {
      System.out.println("this is perfect number ");
    } else {
      System.out.println(" this is not perfect number ");
    }

  }
}