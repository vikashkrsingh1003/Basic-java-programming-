//Encapsulation getter/setter example

class Encap{
private int x;
private int y;

//member data 

public int getX(){

return x;
}

public void setX(int x){

this.x= x;
}

public int getY(){

return y;
}

public void setY(int y){

this.y= y;
}

public static void main (String args[]){

  Encap e1= new Encap();
e1.setX(11);
e1.setY(22);

System.out.println("X_ Co :"+ e1.getX());
System.out.println("Y_ Co :"+ e1.getY());

}
}