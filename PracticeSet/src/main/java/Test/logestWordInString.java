package Test;

public class logestWordInString {

	public static void main(String[] args) {
        String inputString = "This is a sample string with some long words";
        String longestWord = findLongestWord(inputString);
        System.out.println("Longest word in the string: " + longestWord);
    }

    public static String findLongestWord(String inputString) {
        String[] words = inputString.split("\\s+"); // Split the input string into words
        String longestWord = ""; // Initialize the longest word variable

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update longest word if a longer one is found
            }
        }

        return longestWord;
    }
}
