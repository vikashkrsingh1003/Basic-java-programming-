import java.util.Scanner;
class TwoD3{ 
          public static void main (String args[]){
   int A[][] = new int [3][3];
int sum=0;
int r,c;
Scanner sc = new Scanner(System.in);
for(r=0;r<3;r++){
      for(c=0;c<3;c++){
    System.out.println("Enter Element" + r+c+":");
 A[r][c] = sc.nextInt();
 sym=sum+A[r][c];
} 
  System.out.println(" Sum :" + sum);
 }
}
