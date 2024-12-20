//check referance heap and scp. CASE 1:- 1.

class S6{
 public static void main (String args[]){
   
  String s1= new String ("bhopal");
 String s2= new String ("bhopal");

  System.out.println(s1==s2);// cheack referance wise (false)
System.out.println(s1.equals(s2));// check content wise(true)
}
}