import java.util.Scanner;

public class RemoveNonAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the string: ");
        String input = sc.nextLine();
        
        String result = input.replaceAll("[^a-zA-Z]", "");
        
        System.out.println("After removing the Output String: " + result);
    }
}
