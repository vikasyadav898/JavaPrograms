package sixTen;

public class ExOfMethodOverloding {
	
	
	public void test(int a) {
		System.out.println("Hi i am vikas");
		
	}
	public void test() {
		System.out.println("Hi i am yadav");
		
	}
	public void test(int a,int b) {
		System.out.println("Hi i am vikas yadav");
		
	}

	public static void main(String[] args) {
		
		ExOfMethodOverloding obj=new ExOfMethodOverloding();
		//obj.test();
		//obj.test(10);
		obj.test(10, 20);
	}

}
