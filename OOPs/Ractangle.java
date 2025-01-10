//using class concept ..! 
// Q1. WAP area of ractangle or parameter ? 

import java.util.Scanner;

 class Ractangle{
  int l;
  int b;
 //intance variable , member , data , state 

 void acceptData() {

 Scanner sc = new Scanner(System.in);
System.out.println("Enter length");
l= sc.nextInt();

System.out.println("Enter breadth");
b= sc.nextInt();
  }

void showData() {

  System.out.println("length is " + l);
System.out.println(" breadth is "+ b);
}

void getArea(){

System.out.println("Area "+ (l*b));
}

void getpira(){

  System.out.println("pirameter " + 2 *(l+b));
}

 public static void main(String args[]){

  Ractangle r = new Ractangle();

r.acceptData();
r.showData();
r.getArea();
r.getpira();
}
}