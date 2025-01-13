public class LargestSmallestWord {
    public static void main(String[] args) {
        String input = "It is a string with smallest and largest word";
        String[] words = input.split(" ");
        String smallest = words[0], largest = words[0];
        
        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word;
            }
            if (word.length() < smallest.length()) {
                smallest = word;
            }
        }
        
        System.out.println("The largest word is '" + largest + "'");
        System.out.println("The smallest word is '" + smallest + "'");
    }
}

