//WAP find second largest element ?

import java.util.Scanner;
class A11{
    public static void main (String args[]){
  
   Scanner sc = new Scanner(System.in);
   int arr[]= new int [7];
  int firstmax=arr[0];
  int secandmax=arr[0];
  
  for(int i=0; i<arr.length;i++){
    System.out.println("enter element of the array "+ arr[i]);
   arr[i]=sc.nextInt();
  }

  
  for(int i=1; i<arr.length; i++){
    if(arr[i]>firstmax){
      secandmax=firstmax;
      firstmax=arr[i];
    }else if (
      arr[i]>secandmax && arr[i]!=firstmax
    ){
     secandmax = arr[i];
    }
  } System.out.println("First largest number :"+ firstmax);
    System.out.println("Second Largest number :"+ secandmax);
    }
  }
         
