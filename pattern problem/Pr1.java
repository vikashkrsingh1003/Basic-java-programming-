import java.util.Scanner;
class Pr1{
    public static void main (String args[]){
   Scanner sc= new Scanner(System.in);
  System.out.println("Enter a number ");
 int n = sc.nextInt();
int count=0;
  for (int i=1; i<=n ; i++){
   if (n%i==0){ 
count++;
}
} if (count==2){
     System.out.println("numbr is prime ");
  }
else{ System.out.println(" number is not a prime number");
}
}
}