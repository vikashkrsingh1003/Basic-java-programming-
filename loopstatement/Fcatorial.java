// Q WAP to print factorial of given number ? 

import java.util.Scanner;

class Loop1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number ");
    int n = sc.nextInt();
    int fact = 1;
    for (int i = 1; i <=n ; i++) {
      fact = fact * i;
    }
    System.out.println("factorial of given number is " + fact);

  }
}