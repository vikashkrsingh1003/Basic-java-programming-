//write a java program to find smallest element from the array?
 
class A9{
  public static void main (String args[]){

 int arr[] = { 100,1, 200, 2, 300, 0, -2};
int min=arr[0];

for(int i=0; i<arr.length;i++){
 if (arr[i]<min){
 min=arr[i];
}
}
System.out.println("smallest element " + min);
  }
}
 