//using class concept ..! 
// WAp area of circle or circumference ? 

import java.util.Scanner;

 class Circle{
 float r ;
  

 void acceptData() {

 Scanner sc = new Scanner(System.in);
System.out.println("Enter radius ");
r = sc.nextFloat();
}

void showData() {

  System.out.println("radius is " + r);
}

void getArea(){

System.out.println("Area "+ (3.14f * r* r));
}

void getCir(){

  System.out.println("Circumference " + 2 *(3.14f*r));
}

 public static void main(String args[]){

  Circle c1 = new Circle();


c1.acceptData();
c1.showData();
c1.getArea();
c1.getCir();
}
}