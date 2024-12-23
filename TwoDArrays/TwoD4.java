import java.util.Scanner;
class TwoD4{ 
          public static void main (String args[]){
   int A[][] = new int [3][3];

int r,c;
Scanner sc = new Scanner(System.in);
for(r=0;r<3;r++){
      for(c=0;c<3;c++){
    System.out.println("Enter Element" + r+c+":");
 A[r][c] = sc.nextInt();

} 
} int sum;
  for(r=0;r<3;r++){
  sum=0;
      for(c=0;c<3;c++){
    System.out.println("\t"+ A[r][c]); 
  sum = sum+A[r][c];
 }
} 
int nums[]= new int[3];
for(r=0;r<3;r++){
  sum=0;
      for(c=0;c<3;c++){
  sum= sum+A[c][r];
}

nums[r]=sum;
System.out.println(" ");
}
  for(int i=0;i<nums.length;i++){
System.out.print("\t" + nums[i]);
}
}
}
     