import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the string: ");
        String input = sc.nextLine();

        String[] words = input.toLowerCase().split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equals("the")) {
                count++;
            }
        }

        System.out.println("The frequency of the word 'the' is: " + count);
    }
}
