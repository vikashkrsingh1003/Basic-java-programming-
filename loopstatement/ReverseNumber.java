// Wap to reverse of the given number 
import java.util.Scanner;
public class Loop6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Any number :"); 
       int n = sc.nextInt();
        
       while (n!=0) {
         int r = n%10;
         System.out.print(r);
         n=n/10;

         }
    }
    
}
