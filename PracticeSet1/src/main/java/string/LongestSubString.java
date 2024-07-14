package string;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
        String str = "abccabcdabcdefghg";
        int n = str.length();
        int maxLength = 0;
        int start = 0;
        String lsub = "";
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);
            
            if (map.containsKey(currentChar)) {
                start = Math.max(map.get(currentChar) + 1, start);
            }
            
            map.put(currentChar, i);
            
            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                lsub = str.substring(start, i + 1);
            }
        }
        
        System.out.println("The longest substring without repeating characters is: " + lsub);
    }

}
