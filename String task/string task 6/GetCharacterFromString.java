import java.util.Scanner;

public class GetCharacterFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter the index: ");
        int index = sc.nextInt();
        
        if (index >= 0 && index < str.length()) {
            char result = str.charAt(index);
            System.out.println("Character at index " + index + ": " + result);
        } else {
            System.out.println("Invalid index! Please enter an index between 0 and " + (str.length() - 1));
        }
    }
}
