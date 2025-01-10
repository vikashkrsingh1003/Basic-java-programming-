// Abstraction class 
// abstract class

abstract class Rgpv{
     public Rgpv(){
         System.out.println("This is RGPV class constructor ");
   }

     public abstract void lab();
     public abstract void cctv();
     public void copycheck(){
      System.out.println("this is copy check method of rgpv is class and this is  non abstract method");
    }

}

class college extends Rgpv{
 public college(){
   System.out.println("this is college class constructor");
   }
public void cctv(){
  System.out.println("This is RGPV cctv method");
 }
public void lab(){
  System.out.println("This is RGPV lab method");
 }
public void staff(){
  System.out.println("This is college staff method");
 }

public static void main(String args[]){
//Rgpv r = new college();
//r.cctv();
//r.lab();
//r.lab();
//r.copyCheck();
//r.staff();
college t1=new college();
t1.cctv();
t1.lab();
t1.copycheck();
t1.staff();
}
}

  



  
  