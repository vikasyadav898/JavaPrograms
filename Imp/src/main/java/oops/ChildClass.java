package oops;

public class ChildClass extends PartentClass {

	public static void main(String[] args) {
		ChildClass ch=new ChildClass(); //creating obj of child class
		ch.test();
		PartentClass ch1=new ChildClass(); //creating obj of child class
		ch1.test();
		PartentClass ch2=new PartentClass();//creating obj of parent class
		ch2.test();
		//ChildClass ch4=new PartentClass() //this is not possible 

	}
	public void test()
	{
		System.out.println("I am child class");
	}

}
