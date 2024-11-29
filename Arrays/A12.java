//  WAP check the number is sorted or not ?

import java.util.Scanner;
class A12 {
  public static void main (String args[]){
  
  int arr[]= new int [5];
  Scanner sc = new Scanner(System.in);
  int count=0;
 
 
        for(int i=0; i<arr.length;i++){
            System.out.print("\t"+ arr[i]);
           arr[i] = sc.nextInt();
        }
         
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length ; j++){
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                    
                }
            } 
        } if(count==0){
               System.out.println("sorted" );
           
}
        else { 
     System.out.println("unsorted");

  }
}
}