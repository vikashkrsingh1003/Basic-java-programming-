import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Check the length of two strings:");
        System.out.println("--------------------------------");

        System.out.print("Input the 1st string: ");
        String string1 = sc.nextLine();

        System.out.print("Input the 2nd string: ");
        String string2 = sc.nextLine();

        System.out.println("String1: " + string1);
        System.out.println("String2: " + string2);

        if (string1.equals(string2)) {
            System.out.println("Expected Output: Strings are equal.");
        } else {
            System.out.println("Expected Output: Strings are not equal.");
        }
    }
}
