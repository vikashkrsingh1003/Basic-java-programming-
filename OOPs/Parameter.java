//parameter   Constructor Exmple 

class Parameter{

 int x;
int y;
//member data 

public Parameter(int a , int b){

x=a;
y=b;

System.out.println(" parameterized Constructor is called ");
}
public void showData(){
System.out.println( " X- Co" + x);
System.out.println( " Y- Co" + y);
}

public static void main (String args[]){

 Parameter p1= new Parameter();
 Parameter p2= new Parameter();
 Parameter p3= new Parameter(); 


p1.showData();
p2.showData();
p3.showData();
Parameter p4= new Parameter(121 , 131);
p4.showData();

Parameter p5= new Parameter(12 , 31);
p5.showData();
 }
}