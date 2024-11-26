import java.util.Scanner;

     class Q10{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int reader =0;
    do { 
         int r = n%10;
        if (r==0){
                reader =1;   
               break;
            }
     else  

      n=n/10;
        } while(1<=n);

      if (reader==1)
    System.out.println("number is duck");
 else 
     System.out.println("number is not  duck");
        
    }
}