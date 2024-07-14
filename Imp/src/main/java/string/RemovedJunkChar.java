package string;

public class RemovedJunkChar {

	public static void main(String[] args) {
		String str="&!%2632 6HVHQvb@%@@";
		String str1=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str1);
		

	}

}
