public class StringToUppercase {
    public static void main(String[] args) {
        String input = "the quick brown fox jumps over the lazy dog";
        String uppercase = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                uppercase += (char) (ch - 32);
            } else {
                uppercase += ch;
            }
        }

        System.out.println("Here is the above string in UPPERCASE:");
        System.out.println(uppercase);
    }
}
