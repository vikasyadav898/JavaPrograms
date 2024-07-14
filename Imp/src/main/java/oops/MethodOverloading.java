package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.test();
		obj.test("vikas");
		

	}
	public void test()
	{
		System.out.println("I am without args");
	}
	public void test(String str)
	{
		System.out.println("I am with args");
	}

}
