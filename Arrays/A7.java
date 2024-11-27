 // print alternate number ?
 
import java.util.Scanner;
class A7 {
  public static void main (String args[]){
    int arr[] = new int[5];
Scanner sc = new Scanner (System.in);
int i;
for(i=0;i<arr.length;i++){
 System.out.println("Enter Element Index of "+ i+ " :");
arr[i]=sc.nextInt();
}

System.out.println(" Length of the array " + arr.length);

System.out.println(" Element of the array "+ arr.length);
for(i=0;i<arr.length;i=i+2){
   System.out.println(i + "index of element " + arr[i]);
}
}
}
