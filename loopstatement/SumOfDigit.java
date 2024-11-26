// wap to print sum of digit of the given number ?

import java.util.Scanner;

class Loop3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number ");
    int n = sc.nextInt();
    int sum = 0;
    while (n != 0) {
      int r = n % 10;
      sum = sum + r;
      n = n / 10;
    }
    System.out.println("sum of digit : " + sum);
  }
}