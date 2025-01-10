// vaeiable argument 

 class VariableArg{

    public static void add(int...x){

    int sum =0;
   
  for(int a:x){
  sum=sum+a;
}
 System.out.println("Sum ios :" + sum);
}

 public static void main(String...args){

  add();
add(10);
add(10,20);
add(10,20,30);
add(10,20,30,40);

  }
}