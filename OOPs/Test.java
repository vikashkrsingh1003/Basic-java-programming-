//interface 

 interface IA{
  
  void a();
} 

//multiple interface use kar sakte hai ... but implement jab call karega tab sare interface //ko override karna hi padega.. ! 


 interface IB{
  
  void b();
} 

  class Test implements IA{

   public void a(){

   System.out.println("this is IA interface  a methode ");
}
public void b(){

   System.out.println("this is IA interface  b methode ");
}

 
   public void hello(){

   System.out.println("this is Test class hello  methode ");
}

  public static void main(String args[]){
//IA obj = new IA();

  //Test obj = new IA();

 IA obj = new Test();
obj.a();
//obj.hello();

 Test t = new Test();
t.a();
t.hello();
t.b();

}
}

