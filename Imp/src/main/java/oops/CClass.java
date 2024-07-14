package oops;

public class CClass extends PClass{

	public static void main(String[] args) {
		CClass c=new CClass();
		PClass c1=new PClass();
		PClass c2=new CClass();

		c.dispaly();
		c1.dispaly();
		c2.dispaly();
		

	}
	public void dispaly()
	{
		System.out.println("Hi am Vikas");
	}

}

class PClass
{
	public void dispaly()
	{
		System.out.println("Hi am Yadav");
	}
}
