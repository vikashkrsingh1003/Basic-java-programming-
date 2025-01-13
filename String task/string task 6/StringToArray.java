import java.util.Scanner;

public class StringToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        // Split the string into an array based on spaces
        String[] strArray = str.split(" ");
        
        System.out.println("String Array Elements:");
        for (String word : strArray) {
            System.out.print(word + " ");
        }
    }
}
