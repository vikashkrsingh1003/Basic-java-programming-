import java.util.Scanner;

public class SwapCharacterPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        StringBuilder swappedStr = new StringBuilder(str);
        
        for (int i = 0; i < str.length() - 1; i += 2) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            swappedStr.setCharAt(i, second);
            swappedStr.setCharAt(i + 1, first);
        }
        
        System.out.println("Swapped String: " + swappedStr.toString());
    }
}
