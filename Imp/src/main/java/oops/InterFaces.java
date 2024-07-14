package oops;

interface Redaing{
	static void read() {
		System.out.println("hi am vikas");
		}
	}
interface Writeting{
	static void read(){
		System.out.println("hi am yadav");
		}
}

class Student implements Redaing,Writeting
{

	public void read() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


public class InterFaces {

	
	public static void main(String[] args) {
Redaing r=new Student();
Redaing.read();
Writeting w=new Student();
Writeting.read();
		
		Student s1=new Student();
		s1.read();
		
	}

}
