import java.util.Scanner;

public class IterateStringCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i < str.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}
