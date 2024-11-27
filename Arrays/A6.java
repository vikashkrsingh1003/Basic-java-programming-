// reverse number in array ?

import java.util.Scanner;
class A6 {
  public static void main (String args[]){
    int arr[] = new int[5];
Scanner sc = new Scanner (System.in);

for(int i=0;i<arr.length;i++){
 System.out.println("Enter Element Index of "+ i+ " :");
arr[i]=sc.nextInt();
}

System.out.println(" length of the array " + arr.length);

System.out.println(" Reverse of the array "+ arr.length);
for(int i=arr.length-1 ;i>=0;i--){
   System.out.println(i + "index of element " + arr[i]);
}
}
}
