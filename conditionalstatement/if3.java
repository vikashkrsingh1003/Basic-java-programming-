// Q3 WAP check number is odd or even ?

import java.util.Scanner;
public class if3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int number ;
    System.out.println("enter a number:-");
    number = sc.nextInt();
    if (number%2==0){
        System.out.println("number is even");
    } if (number%2==1) {
        System.out.println("number is odd");
        
    }
   } 
}
