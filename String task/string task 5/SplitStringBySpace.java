import java.util.Scanner;

public class SplitStringBySpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a string: ");
        String input = scanner.nextLine();
        
        String[] words = input.split(" ");
        
        System.out.println("Strings or words after split by space are:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

