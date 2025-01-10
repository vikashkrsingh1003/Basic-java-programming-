
import java.util.Scanner;

 class Student{

  String name = new String();
  String enroll  = new String();

  int p ;
int c;
int m;
int h;
int e;
 
 

void getData(){

 Scanner sc = new Scanner(System.in);
System.out.println("Enter Student NAme ");
name = sc.nextLine();

System.out.println("Enter Student enrollment ");
 enroll = sc.nextLine();

 System.out.println("Enter a physics Marks ");
p = sc.nextInt();

System.out.println("Enter a Chemistry MArks ");
c = sc.nextInt();

System.out.println("Enter a Math Marks ");
m = sc.nextInt();

System.out.println("Enter a Hindi MArks ");
h = sc.nextInt();

System.out.println("Enter a English  MArks ");
e = sc.nextInt();

 }

void showData(){

  System.out.println(" Student name is " + name);
System.out.println(" Student enrollment  is " + enroll);

System.out.println(" physics marks " + p);
System.out.println(" chemistry marks " + c);
System.out.println(" math marks " + m);
System.out.println(" hindi  marks " + h);
System.out.println(" English marks " + e);
}

int getTotalMarks(){
     int totalmarks= p+c+m+h+e;
   //System.out.println(" Total marks is " + TotalMarks );
}

float getPercentage(int TotalMarks ) {
   return (float) TotalMarks/5;
}

  public static void main (String args[]){

    Student s1 = new Student();

  s1.getData();
  s1.showData();
  int tm= s1.getTotalMarks();
  System.out.println("Total marks is :" + tm);
  float p = s1.getPercentage(tm);
  System.out.println("persentage is : " + p);
  }
}







   


   
     