import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the string:");
        String inputString = scanner.nextLine();
        
        String[] words = inputString.split("\\s+");
        int wordCount = words.length;
        
        System.out.println("Total number of words in the string is: " + wordCount);
    }
}
