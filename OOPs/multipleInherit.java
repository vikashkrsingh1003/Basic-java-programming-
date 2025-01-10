//one instance can extends more than one interface;

//it is known as multiple inheritanece 


 interface IA{
  
  void a();
} 

 interface IB{
  
  void b();
} 

 interface IC extends IA,IB{
  
  void c();
} 

  class multipleInherit implements IC{

   public void a(){

   System.out.println("this is IA interface  a methode ");
}
public void b(){

   System.out.println("this is IA interface  b methode ");
}

public void c(){

   System.out.println("this is IA interface  c methode ");
}

 
   public void hello(){

   System.out.println("this is Test class hello  methode ");
}

  public static void main(String args[]){
//IA obj = new IA();

  //Test obj = new IA();

 IA obj = new multipleInherit();
obj.a();
//obj.hello();

 multipleInherit t = new multipleInherit();
t.a();
t.hello();
t.b();
t.c();

}
}
