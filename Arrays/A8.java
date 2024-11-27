import java.util.Scanner;
class A8 {
  public static void main (String args[]){
    int arr[] = new int[5];
Scanner sc = new Scanner (System.in);
int i;
for(i=0;i<arr.length;i++){
 System.out.println("Enter Element Index of "+ i+ " :");
arr[i]=sc.nextInt();
}

System.out.println(" Length of the array " + arr.length);

System.out.println("odd index Element of the array "+ arr.length);
for(i=0;i<arr.length;i++){
   if (i%2!=0){
   System.out.println(i + "index of element " + arr[i]);
}
}
}
}
