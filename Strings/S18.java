//ValueOf() method ( it use both premetive or non premetive)

class S18{
  public static void main(String args[]){

  Integer x= 123451;  
 String a = String.valueOf(x);
  System.out.println(a.length());

 float y= 45.91f;  
 String b= String.valueOf(y);
  System.out.println(b.length());

  char z= 'A';  
 String c= String.valueOf(z);
  System.out.println(c.length());



  }
}