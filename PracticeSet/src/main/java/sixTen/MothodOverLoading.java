package sixTen;

public class MothodOverLoading {
	
	public void test() {
		System.out.println("Hi i am vikas ");
		
	}
	public void test(int a) {
		System.out.println("Hi i am yadav ");
		
	}

	public static void main(String[] args) {
		MothodOverLoading obj=new MothodOverLoading();
		obj.test();
		obj.test(10);
		

	}

}
