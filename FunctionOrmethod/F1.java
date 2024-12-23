//Function and method in java ...!

//Type1:- Taking Nothing and Returning nothing 

import java.util.Scanner;
class F1{

  public void add(){

   //step1:- Declear variable 

   int a,b,c;

  //step2:-Input
 System.out.println("===== Add Function is called ======");

  Scanner sc = new Scanner(System.in);
System.out.println("Enter value of A:");
  
   a= sc.nextInt();
System.out.println("Enter value of B:");
  
   b= sc.nextInt();

//perform operation 

  c=a+b;
// print result 

System.out.println("Addition "+c);

   }
  

  public static void main(String args[]){

   F1 obj=new F1();
//c

   obj.add();
  }
}
