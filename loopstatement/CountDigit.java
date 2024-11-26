// wap to count number of digit in the given number ?

import java.util.Scanner;

class Loop4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number ");
    int n = sc.nextInt();
    int count = 0;
    while (n != 0) {
      count++;
      n = n / 10;
    }
    System.out.println(" number of digits in the given no : " + count);

  }
}