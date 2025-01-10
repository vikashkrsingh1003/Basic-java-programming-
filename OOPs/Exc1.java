//Exception handling program....!

  class Exc1{
  public static void main( String args[]){

   System.out.println(" hello saurav Singh");

  int a,b,c=0;

  a=10;
  b=0;

  System.out.println(" Before Exeception ");
try{
System.out.println(" enter try");
 c= a/b;

System.out.println(" exit try ");
}
catch(ArithmeticException ae){

  System.out.println("this is catch block");
System.out.println("Denominator should not be zero");

}


  System.out.println(c);
System.out.println(" After Exeception ");
System.out.println(" heros ");

  }

}