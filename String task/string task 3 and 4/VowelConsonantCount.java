import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the string: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("The total number of vowel in the string is: " + vowels);
        System.out.println("The total number of consonant in the string is: " + consonants);
    }
}

