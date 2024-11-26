
// Q WAP TO PRINT TABLE OF GIVEN NUMBER USING WHILE , DO WHILE AND FOR LOOP ?
import java.util.Scanner;

public class L3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("enter any number:-");
        n = sc.nextInt();
       // i = 1;
       /*  while (i <= 10) {
            System.out.println(n + "*" + i + " = " + (n * i));  //while loop
            i++;
        }*/
      /* 
        do {
            System.out.println(n + "*" + i + " = " + (n * i));  // do while loop
            i++;
        } while (i <= 10); */
       
        for (i=1; i<=10 ; i++){
            System.out.println(n + "*" + i + " = " + (n * i)); // for loop
            
        }
    
    }
}
