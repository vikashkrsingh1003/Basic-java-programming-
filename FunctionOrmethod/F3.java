//Type1:- Taking Nothing and Returning nothing 

import java.util.Scanner;
class F3{

  public void isprime(){

   //step1:- Declear variable 

   int num;
  int count=0;

  //step2:- Take Input
 System.out.println("===== Add Function is called ======");

  Scanner sc = new Scanner(System.in);
System.out.println("Enter any num :");
  
   num = sc.nextInt();

 for(int i=1;i<num;i++){ 

    if(num%i==0){
  count++;
    
     } 
  } 

  if(count<=2){
  System.out.println("prime");
}
 else{

System.out.println("not prime");

}
}
public static void main(String args[]){

   F3 obj=new F3();
   obj.isprime();
  }
}

   
