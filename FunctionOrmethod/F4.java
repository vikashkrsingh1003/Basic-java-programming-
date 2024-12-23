

//Type2:- Taking Something  and Returning nothing 

import java.util.Scanner;
class F4{

  public void add(int a,int b){

  

//perform operation 

 int  c=a+b;
// print result 

System.out.println("Addition "+c);

   }
  

  public static void main(String args[]){
   
 
  Scanner sc = new Scanner(System.in);
System.out.println("Enter value of N1:");
  
  int n1 = sc.nextInt();
System.out.println("Enter value of N2:");
  
  int  n2 = sc.nextInt();


   F4 obj=new F4();

   obj.add(n1,n2);
  }
}
