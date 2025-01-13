public class ReplaceSpaces {
    public static void main(String[] args) {
        String input = "Be glad to see the back of";
        char replaceChar = '*';
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                result += replaceChar;
            } else {
                result += ch;
            }
        }

        System.out.println("After replacing the space with '" + replaceChar + "' the new string is:");
        System.out.println(result);
    }
}

