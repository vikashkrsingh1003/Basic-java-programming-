//toCharAraay() method

class S12{
 public static void main(String args[]){

 String s = "wlcome";

 char arr[] = s.toCharArray();
System.out.println(" using for loop ");
int i;
for(i=0;i<arr.length;i++){
 System.out.println(arr[i]);
}
 System.out.println(" Using for each loop");

 for(char x:arr){
 System.out.println(x);
}
  }
}