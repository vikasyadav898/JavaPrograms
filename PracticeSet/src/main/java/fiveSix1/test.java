package fiveSix1;

public class test {
	public static void main(String[] args) {
        String str="vikas yadv";
        String word[]=str.split(" ");
        String rev="";
        for(String w:word)
        {
            String revString="";
            for(int i=w.length()-1;i>=0;i--){
                revString=revString+w.charAt(i);
            }
            rev=rev+revString;
            }
            System.out.println(rev);
        }

}
