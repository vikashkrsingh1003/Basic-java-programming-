//WAp convert given lowercase String into uppercase..?

class S13{
  public static void main(String args[]){

  String s= "WelCome";
  String r="";
   

  for(int x:s.toCharArray()){

  
  if(x>='a' && x<='z'){
   
   x=x-32;
  r=r+(char)x;

 
 } else{
   r=r+(char)x;
   }
  }
System.out.println(r);
 }

  
}