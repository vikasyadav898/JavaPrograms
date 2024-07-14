package exception;

public class Nullpointer {

	 public static void main(String[]args)
	 {
		 String str=null;
		 try
		 {
			 int len=str.length();
		 }catch(NullPointerException e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
}
