import java.util.Scanner;
 class S4{
  public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
 System.out.println(" Enter a string 1 :");
String S1 = sc.nextLine();
 System.out.println(" Enter a string 2 :");
String S2 = sc.nextLine();

int x=S1.compareTo(S2);

if (x>0){
System.out.println( S1+ " is Grater");
}
else if (x<0){
System.out.println( S2+ " is Grater");
}
else if (x==0){
System.out.println( S1+"and " + S2+ " are equal");
} 

 }
}
 