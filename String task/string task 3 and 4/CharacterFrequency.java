import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the string: ");
        String input = sc.nextLine();

        System.out.print("Input the character to find frequency: ");
        char target = sc.next().charAt(0);

        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == target) {
                count++;
            }
        }

        System.out.println("The frequency of '" + target + "' is: " + count);
    }
}
