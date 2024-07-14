package six15;

public class DivisionWithout {

	public static void main(String[] args) {
		 int a=15;
		 int b=5;
		 int count=0;
//		 for(int i=b;i<=a;i=i+5) {
//			 count++;
//		 }
//		 System.out.println(count);
		 
		 
		 while(a>=b){
			 a=a-b;
			 count++;
		 }
		 System.out.println(count);
	}

}
