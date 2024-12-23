
//Type3:- Taking Nothing and Returning Something 

import java.util.Scanner;
class F5{

  public int add(){

   //step1:- Declear variable 

   int a,b;

  //step2:-Input
 System.out.println("===== Add Function is called ======");

  Scanner sc = new Scanner(System.in);
System.out.println("Enter value of A:");
  
   a= sc.nextInt();
System.out.println("Enter value of B:");
  
   b= sc.nextInt();

//perform operation 

 int c=a+b;
// return  result 

return c;

   }
  

  public static void main(String args[]){

   F5 obj=new F5();
 
int r =obj.add();

   System.out.println("Addition" +r);
  }
}
