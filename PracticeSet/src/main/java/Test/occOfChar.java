package Test;

public class occOfChar {
	public static void main(String[] args) {
        // Given string
        String mainString = "vikasyadav";
        
        // Character to find
        char targetChar = 'a';

        // Initialize count
        int count = 0;

        // Iterate through the main string
        for (int i = 0; i < mainString.length(); i++) {
            // Check if the current character matches the target character
            if (mainString.charAt(i) == targetChar) {
                count++;
            }
        }

        // Print the result
        System.out.println("The character '" + targetChar + "' occurs " + count + " times in the main string.");
    }

}
