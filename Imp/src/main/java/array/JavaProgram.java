package array;

import org.apache.commons.exec.ExecuteException;

public class JavaProgram {

	public static void main(String[] args) {
		System.out.println(10/0);
		try {
			System.out.println("vikas");
		}catch(Exception e) {
			System.out.println("yadav");
			
		}finally {
			System.out.println("pritha");
		}
		

	}

}
