//trim() method :- for remove first and last space in string ..!

import java.util.Scanner;
 class S20{
  public static void main(String args[]){
 
  Scanner sc = new Scanner(System.in);
 System.out.println("Enter any Strings :");
 String s = "  hello  world  ";
 System.out.println("length of Strings before trim :" + s.length());

 String s1= s.trim();
System.out.println("length of Strings after trim:" + s1.length());

  }
}