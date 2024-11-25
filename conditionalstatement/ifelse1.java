
// WAP check eligible for voting or not ?
import java.util.Scanner;

public class ifelse1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("enter your age :- ");
        age = sc.nextInt();
        if (age > 18) {
            System.out.println("you are eligible for voting ");
        } else {
            System.out.println("you are not eligible for voting ");
        }
    }
}
