//WAP find second largest element ?

import java.util.Scanner;
class A13{
    public static void main (String args[]){
  
   Scanner sc = new Scanner(System.in);
   int arr[]= new int [7];
  int firstmin=arr[0];
  int secandmin=arr[0];
  
  for(int i=0; i<arr.length;i++){
    System.out.println("enter element of the array "+ arr[i]);
   arr[i]=sc.nextInt();
  }

  
  for(int i=1; i<arr.length; i++){
    if(arr[i]<firstmin){
      secandmin=firstmin;
      firstmin=arr[i];
    }else if (
      arr[i]>secandmin && arr[i]!=firstmin
    ){
     secandmin = arr[i];
    }
  } System.out.println("First Smallest number :"+ firstmin);
    System.out.println("Second Smallest number :"+ secandmin);
    }
  }
         
