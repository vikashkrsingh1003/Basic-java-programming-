 import java.util.Scanner;
 
 class Employee{

    String name;

    int empno;
   float sal;
  
void acceptData() {

 Scanner sc = new Scanner(System.in);
System.out.println("Enter employee name");
 name= sc.nextLine();

System.out.println("Enter emp number");
 empno = sc.nextInt();

System.out.println("Enter salary  ");
sal = sc.nextFloat();
  }

 void showData() {

  System.out.println("employee name is  " + name );
 System.out.println(" employee number is  "+ empno);
 System.out.println(" employee salary   "+ sal);

}

  double getHRA(){

    return sal*0.25;
 
}

double getDA(){

return sal*0.2;

}

double getTA(){

 return sal*0.1;

}

double grossSalary( double hra , double da, double ta){

 return sal+hra+da+ta;

}

double getTotalIncentive(double hra, double da, double ta){

  return hra+da+ta;
}

  



    public static void main (String args[]){


    Employee e= new Employee();

   e.acceptData();
   e.showData();

  double hra,da,ta;
  hra = e.getHRA();
  System.out.println(" nHRA : "+ hra);

 da = e.getDA();
System.out.println("DA : " + da);

ta= e.getTA();
System.out.println("TA : "+ ta);

System.out.println("Total Incentive :" + e.getTotalIncentive(hra,da,ta));
System.out.println("Gross Salary :" + e.grossSalary(hra,da,ta));
 
}
}


     
    


   

    



   