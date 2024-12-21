/*Write a Java Program to check given String is
UpperCase or not?
*/

  import java.util.Scanner;
 class S19{
  public static void main(String args[]){
 
  Scanner sc = new Scanner(System.in);
 System.out.println("Enter any Strings :");
 String s = sc.nextLine();
   String r = "";
  for(int x: s.toCharArray()){
  
  if(x>='A' && x<='Z'){
   r= r+(char)x;
   }
   else if(x==32){
   r=r+(char)x;
}
 
} 
 
System.out.println(s.equals(r));
   }
}



 