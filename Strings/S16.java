//toUpperCase()  and toLowerCase() 

import java.util.Scanner;
class S16{
  public static void main(String args[]){

 Scanner sc = new Scanner(System.in);
 System.out.println(" Enter a Any Strings: ");
String s= sc.nextLine();

 /* String r= s.toUpperCase();
System.out.println(" Result: " +r); */ 

String x = s.toLowerCase();
System.out.println(" Result :" + x);
 
  }
}