package Test;

public class occrence {

	public static void main(String[] args) {
        // Main string
        String mainString = "This is a test. This test is for counting the occurrence of a substring in this test string.";

        // Substring to find
        String subString = "test";

        // Initialize count
        int count = 0;

        // Get the length of the substring
        int subStringLength = subString.length();

        // Iterate through the main string
        for (int i = 0; i <= mainString.length() - subStringLength; i++) {
            // Check if the substring matches
            if (mainString.substring(i, i + subStringLength).equals(subString)) {
                count++;
            }
        }

        // Print the result
        System.out.println("The substring \"" + subString + "\" occurs " + count + " times in the main string.");
    }

}
