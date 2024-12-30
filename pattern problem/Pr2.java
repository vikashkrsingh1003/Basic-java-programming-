import java.util.Scanner;
class Pr2{
    public static void main (String args[]){
   Scanner sc= new Scanner(System.in);
  System.out.println("Enter a number ");
 int n = sc.nextInt();
 int t1,t2,t3;
t1=0;
t2=1;
System.out.print("\t" + t1 + "\t" + t2 );
for (int i=3; i<=n; i++){
t3= t1+t2;
System.out.print("\t"+t3);
t1=t2;
t2=t3; 
  }

}
}