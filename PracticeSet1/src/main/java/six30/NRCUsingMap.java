package six30;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NRCUsingMap {

	public static void main(String[] args) {
        String str = "siddhi";
        
        // LinkedHashMap to maintain insertion order
        Map<Character, Integer> charCount = new HashMap<Character, Integer>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        System.out.println(charCount);

        // Find the first non-repeating character
        char firstNonRepeatingChar = '\0'; // default value if no non-repeating character found

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                firstNonRepeatingChar = entry.getKey();
                break;
            }
        }

        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found");
        }
    }

}
