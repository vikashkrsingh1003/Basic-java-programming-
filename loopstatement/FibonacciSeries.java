// Wap fibonacci series ?

import java.util.Scanner;
class P1{
	public  static void main(String args[]){
	
	Scanner sk=new Scanner(System.in);
	System.out.println("Enter Any No : ");
	int n=sk.nextInt();//5

	int t1,t2,t3;
	t1=0;
	t2=1;
	t3=0;

	System.out.print("\t"+t1+"\t"+t2);//0  1  1   2  3
	for(int i=3;i<=n;i++){//t1=2,  t2=3,t3=3
	t3=t1+t2;
	System.out.print("\t"+t3);
	t1=t2;
	t2=t3;
    t3=t1;
	}
    }
}	