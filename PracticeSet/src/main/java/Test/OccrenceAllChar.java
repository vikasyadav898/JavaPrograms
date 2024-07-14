package Test;

import java.util.HashMap;
import java.util.Map;

public class OccrenceAllChar {
	public static void main(String[] args) {
        // Given string
        String mainString = "vikasyadav";

        // Initialize a map to store character counts
        Map<Character, Integer> charCounts = new HashMap<Character, Integer>();

        // Iterate through the main string
        for (int i = 0; i < mainString.length(); i++) {
            char currentChar = mainString.charAt(i);
            // Update the count in the map
            charCounts.put(currentChar, charCounts.getOrDefault(currentChar, 0) + 1);
        }

        // Print the character occurrences
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }

}
