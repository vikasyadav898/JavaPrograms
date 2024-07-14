package collection0507;

public class MethodOverriding extends Abc {
	public static void main(String[] args) {
		MethodOverriding meth=new MethodOverriding();
		Abc meth1=new Abc();
		Abc meth2=new MethodOverriding();
		meth.isDisplay();
		meth1.isDisplay();
		meth2.isDisplay();
		
		
		

	}
	public void isDisplay()
	{
		System.out.println("Hi am pritha");
	}

}

class Abc{
	
	public void isDisplay()
	{
		System.out.println("Hi am yadav");
	}
}
