//Type1:- Taking Nothing and Returning nothing 

import java.util.Scanner;
class F2{

  public void evenOrOdd(){

   //step1:- Declear variable 

   int num;

  //step2:-Input
 System.out.println("===== Add Function is called ======");

  Scanner sc = new Scanner(System.in);
System.out.println("Enter Any number :");
  
   num= sc.nextInt();

//perform operation 

if(num%2==0){
   
  System.out.println("even");
}
else{

System.out.println("even");}
   



   }
  

  public static void main(String args[]){

   F2 obj=new F2();
//c

   obj.evenOrOdd();
  }
}