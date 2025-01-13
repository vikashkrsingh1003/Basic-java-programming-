import java.util.Arrays;
import java.util.Scanner;

public class SortStringAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the string: ");
        String input = sc.nextLine();

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);

        String sortedString = new String(charArray);

        System.out.println("After sorting the string appears like: ");
        System.out.println(sortedString);
    }
}
