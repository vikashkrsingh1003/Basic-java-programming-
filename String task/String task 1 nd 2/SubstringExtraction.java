import java.util.Scanner;

public class SubstringExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the string:");
        String inputString = scanner.nextLine();
        
        System.out.println("Input the position to start extraction:");
        int startPosition = scanner.nextInt();
        
        System.out.println("Input the length of substring:");
        int length = scanner.nextInt();
        
        String substring = inputString.substring(startPosition, startPosition + length);
        System.out.println("The substring retrieved from the string is: \"" + substring + "\"");
    }
}
