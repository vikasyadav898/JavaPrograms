package collection0507;

public class MethodOverLoading {
	
	public void idDisplay()
	{
		System.out.println("Hi am Pritha");
	}
	public void idDisplay(int num)
	{
		System.out.println("Hi am yadav");
	}

	public static void main(String[] args) {
		MethodOverLoading meth=new MethodOverLoading();
		meth.idDisplay();
		meth.idDisplay(10);
		

	}

}
