/*Write a java program to convert a character of
the String if character is UpperCase then it convert
into lowerCase and if Character is lowerCase then it
convert into UpperCase...?  ( Toggle case ) */


import java.util.Scanner;
class S15{
  public static void main(String args[]){

 Scanner sc = new Scanner(System.in);
 System.out.println(" Enter a Any Strings: ");
String s= sc.nextLine();

 String r="";
 for(int x:s.toCharArray()){
   
     if(x>='A' && x<='Z'){
   
    x=x+32;
    r=r+(char)x;
  }
 else if(x>='a' && x<='z'){

 x=x-32;
r=r+(char)x;
  }
}
System.out.println(r);
  }

}

