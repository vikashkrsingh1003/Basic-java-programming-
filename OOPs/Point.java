//default  Constructor Exmple 

class Point{

 int x;
int y;
//member data 

public Point(){

x=1;
y=1;

System.out.println(" Default Constructor is called ");
}
public void showData(){
System.out.println( " X- Co" + x);
System.out.println( " Y- Co" + y);
}

public static void main (String args[]){

 Point p1= new Point();//point default constructor called 
Point p2 = new Point();// point default constructor called
Point p3 = new Point();// point default constructor called

p1.showData();
p2.showData();
p3.showData();

 }
}