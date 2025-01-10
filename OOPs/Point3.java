//Inheritance 

class Point3{

  int x;
  int y;

  public Point3(){

System.out.println(" Default Constructor is called ");
}


public Point3 (int a, int b){

this.x =x;
this.y=y;

System.out.println(" parametrized  Constructor is called ");

}

public static void main (String args[]){

 Point3 p1= new Point3();
Point3 p2 = new Point3(10,20);

}
}