class Parent{

   public void show(){
    System.out.println("This is a prant class show method ");
  }
} 

 class Child extends Parent{

    public void show(){
    System.out.println("This is a prant class show method ");
  }

   public static void main(String args[]){

    Parent c = new Child();
  c.show();
}
}
    