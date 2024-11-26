// wap to check number is pelindrom or not?

import java.util.Scanner;
 class Loop7 {
       public static void main (String args[]){
   Scanner sc = new Scanner(System.in);

   System.out.println("enter a any number ");
 int n= sc.nextInt();
int res=0;
 int m=n;
while (n!=0){
    int r = n%10;
  res = res*10+r;
n=n/10;
}

if(m==res){
System.out.println(" pelindrome number ");
}
else{
 System.out.println("not pelindrome number");
}
}
}