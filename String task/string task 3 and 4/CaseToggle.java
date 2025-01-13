import java.util.Scanner;
	
public class CaseToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the string: ");
        String input = sc.nextLine();
        
        StringBuilder toggledString = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c);
            }
        }
        
        System.out.println("The given sentence is: " + input);
        System.out.println("After Case changed the string is: " + toggledString);
    }	
}
