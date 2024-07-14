package array;

public class OddNumberInArray {

	public static void main(String[] args) {
		int arr[]= {10,23,52,68,96,78,45,45,55};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
			

	}

}
