package sixTen;

public class MothodOverriding {
	public void test() {
		System.out.println("Hi am vikas yadav");
	}

	public static void main(String[] args) {
		MothodOverriding obj=new MothodOverriding();
		MothodOverriding obj1=new MothodOverriding1();
		obj.test();
		obj1.test();
		

	}

}
