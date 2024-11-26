//WAP to check given number is prime or not ?
import java.util.Scanner;
public class Loop9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter any number");
       int n = sc.nextInt();
       int count =0;
       for(int i=1;i<=n;i++){
         if(n%i==0){
            count++;
         }
       } if (count==2){
        System.out.println("this number is prime ");
       }else{
        System.out.println("this number is not prime ");
       
       }

    }
}