package test1;

public class occurenceofChar {
	
	public static void countCharacters(String s) {
        // Create an array of size 256 (for extended ASCII)
        int[] counts = new int[256];

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            counts[charAt]++;
        }

        // Print the counts
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println("Character '" + (char) i + "': " + counts[i]);
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "vikasyadav";
        countCharacters(inputString);
    }

}
