//WAp convert given uppercase String into lowercase..?

class S14{
  public static void main(String args[]){

  String s= "WelCome";
  String r="";
   

  for(int x:s.toCharArray()){

  
  if(x>='A' && x<='Z'){
   
   x=x+32;
  r=r+(char)x;

 
 } else{
   r=r+(char)x;
   }
  }
System.out.println(r);
 }

  
}