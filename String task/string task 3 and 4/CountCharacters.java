import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the string: ");
        String input = sc.nextLine();

        int alphabets = 0, digits = 0, specialChars = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabets++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else if (!Character.isWhitespace(c)) {
                specialChars++;
            }
        }

        System.out.println("Number of Alphabets in the string is: " + alphabets);
        System.out.println("Number of Digits in the string is: " + digits);
        System.out.println("Number of Special characters in the string is: " + specialChars);
    }
}
