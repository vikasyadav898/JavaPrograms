package string;

public class FindCountOfWord {

	public static void main(String[] args) {
        System.out.print(countOfWord("vikas vikas yadav"));
    }
    
    public static int countOfWord(String str) {
        String words[] = str.split(" ");
        String substr = "vikas";
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(substr)) {
                count++;
            }
        }
        return count;
    }

}
