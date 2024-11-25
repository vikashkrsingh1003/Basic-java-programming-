
// Q2 WAp check the charecter  is vowel or not ?
import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("enter any charecter :-");
        c = sc.next().charAt(0);
        if (c == 'a' || c == 'i' || c == 'o' || c == 'e' || c == 'u' || c == 'A' || c == 'I' || c == 'E' || c == 'U'
                || c == 'O') {
            System.out.println(" this is vowel ");

        } else {
            System.out.println("this is constant ");
        }
    }

}
