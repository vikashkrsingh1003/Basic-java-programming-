// WAP TO PRINT SUM OF EVEN DIGITS OF THE GIVEN NUMBER ?

import java.util.Scanner;

class Loop5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number ");
    int n = sc.nextInt();
    int sum = 0;
    while (n != 0) {
      int r = n % 10;
      if (r % 2 == 0) {
        sum = sum + r;
      }
      n = n / 10;
    }
    System.out.println(sum);

  }
}