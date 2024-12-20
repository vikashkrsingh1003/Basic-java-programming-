// CASE 1:- 2.(in this case heap are not involved cause of not new object create , so check only scp referance )
class S7{
 public static void main (String args[]){
   
  String s1 =  "bhopal";
  String s2 = "bhopal";

  System.out.println(s1==s2);// cheack referance wise (true)
System.out.println(s1.equals(s2));// check content wise(true)
 }
}