package array;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6};
		int sumarr=0;
		int sumnewArray=0;
		int missingnumber=0;
		for(int i=0;i<arr.length;i++) {
			sumarr=sumarr+arr[i];
		}
		
		for(int i=0;i<=6;i++) {
			sumnewArray=sumnewArray+i;
		}
		missingnumber=sumnewArray-sumarr;
		System.out.println(missingnumber);

	}

}
