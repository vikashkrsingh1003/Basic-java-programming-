//join(":",arr) methode 

import java.util.Scanner;
 class S21{
  public static void main(String args[]){
 
  Scanner sc = new Scanner(System.in);
 System.out.println("Enter any Strings :");
 String s = "hello world java";

  String arr[] = s.split(" ");
String r = String.join(":",arr);

   System.out.println(r);
  }
}