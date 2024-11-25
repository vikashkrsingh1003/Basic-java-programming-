// Q2 :- WAP check number is negative or positive ? 

import java.util.Scanner;
public class if2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n ; 
        System.out.println("enter a number :- ");
        n = sc.nextInt();
     
        if(n >0 ) {
            System.out.println(" number is positive ");
            
        } if (n<0) {
            System.out.println("number is negative ");
            
        }

    }
    
}
