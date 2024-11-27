//WAP find largest element ?

class A10{
  public static void main (String args[]){

 int arr[] = { 100,1, 200, 2, 300, 0, -2};
int max=arr[0];

for(int i=0; i<arr.length;i++){
 if (arr[i]>max){
 max=arr[i];
}
}
System.out.println("Largest element " + max);
  }
}
