import java.util.Scanner;
	
public class StringValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a string: ");
        //String input = scanner.nextLine();

      /*if (input.length() < 3) {
            System.out.println("Error: The string must have at least 3 characters.");
        } else if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Error: The string must contain only alphabets.");
        } else {
            System.out.println("Valid string: " + input);
        }
        
       
        if (input.length() != 5) {
            System.out.println("Error: The string must have exactly 5 characters.");
        } else if (!input.matches("[0-9]+")) {
            System.out.println("Error: The string must contain only digits.");
        } else {
            System.out.println("Valid string: " + input);
        }

  if (input.length() < 6) {
            System.out.println("Error: The string must have at least 6 characters.");
        } else if (!input.matches("[a-zA-Z0-9@]+")) {
            System.out.println("Error: The string must not contain special characters except @.");
        } else {
            System.out.println("Valid string: " + input);
        }
        
        
//Write a program that accepts an array by 10 names and display all names that start with “A”.


        String[] names = new String[10];
        
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }
        
        System.out.println("Names starting with 'A':");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        
        
       
    }

//Write a program that accepts an array by 10 names and display all names that end with “h”.

        String[] names = new String[10];
        
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }
        
        System.out.println("Names ending with 'h':");
        for (String name : names) {
            if (name.endsWith("h")) {
                System.out.println(name);
            }
     
} */

        String[] names = new String[10];
        
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }
        
        System.out.println("Names containing 'he':");
        for (String name : names) {
            if (name.contains("he")) {
                System.out.println(name);
            }
        }
   



        
    }
}
