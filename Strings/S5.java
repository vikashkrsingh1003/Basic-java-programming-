import java.util.Scanner;
 class S5{
  public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
 System.out.println(" Enter a string 1 :");
String S1 = sc.nextLine();
 System.out.println(" Enter a string 2 :");
String S2 = sc.nextLine();


String S3= S1.concat(S2);
System.out.println(S3);
}
}