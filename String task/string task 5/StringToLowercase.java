public class StringToLowercase {
    public static void main(String[] args) {
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        String lowercase = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowercase += (char) (ch + 32);
            } else {
                lowercase += ch;
            }
        }

        System.out.println("Here is the above string in lowercase:");
        System.out.println(lowercase);
    }
}

