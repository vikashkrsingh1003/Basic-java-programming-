import java.util.Scanner;
class TwoD2 {
  
   public static void main (String args[]){
  int A[] = new int [2][5];
  int r,c;
Scanner sc = new Scanner (System.in);
for(r=0;r<A.length;r++){
     for (c=o;c<A[r].length;c++){
  System.out.println ("Enter elemet index of " +r+c+ ":");
 A[r][c] = sc.nextInt();
}
}
System.out.println(" Output of 2d array : ");

for(r=0;r<A.length;r++){
     for (c=o;c<A[r].length;c++){
  System.out.println (" " +A[r][c]);
}
System.out.println(" ");
}
}