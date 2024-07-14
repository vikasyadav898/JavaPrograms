package test1;

public class PrintFisrtChar {
	public static void main(String[] args) {
        String input = "Vikas Prakash yadav";
        printFirstCharacters(input);
    }

    public static void printFirstCharacters(String input) {
        // Split the input string into words
        String[] words = input.split(" ");

        // Iterate through the words and print the first character of each
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0) + " ");
            }
        }
    }

}
