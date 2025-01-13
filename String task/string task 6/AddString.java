import java.util.Scanner;

public class AddString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String mainStr, addStr;
        int position;

        System.out.print("Enter the main string: ");
        mainStr = sc.nextLine();
        
        System.out.print("Enter the string to add: ");
        addStr = sc.nextLine();
        
        System.out.print("Enter the position (0 for beginning, -1 for end, or index number): ");
        position = sc.nextInt();

        if (position == -1) {
            mainStr = mainStr + addStr;
        } else if (position == 0) {
            mainStr = addStr + mainStr;
        } else if (position >= 0 && position <= mainStr.length()) {
            mainStr = mainStr.substring(0, position) + addStr + mainStr.substring(position);
        } else {
            System.out.println("Invalid position");
            return;
        }

        System.out.println("Output String: " + mainStr);
    }
}

