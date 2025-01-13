import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the string: ");
        String mainString = sc.nextLine();
        
        System.out.print("Input the substring to be search: ");
        String subString = sc.nextLine();
        
        if (mainString.contains(subString)) {
            System.out.println("The substring exists in the string.");
        } else {
            System.out.println("The substring does not exist in the string.");
        }
    }
}
