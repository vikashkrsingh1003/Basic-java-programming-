//Type4:- Taking Something  and Returning Something ...! 

import java.util.Scanner;
class F6{

  public int add(int n1,int n2){//formal argument

  

//perform operation 

 int  c=n1+n2;
// return  result 

return c;
   }
  

  public static void main(String args[]){
   
 
  Scanner sc = new Scanner(System.in);
System.out.println("Enter value of N1:");
  
  int n1 = sc.nextInt();
System.out.println("Enter value of N2:");
  
  int  n2 = sc.nextInt();


   F6 obj=new F6();

   int r =obj.add(n1,n2);
System.out.println("Addition :-"+ r);
  }
}
