package array;

public class EvenNumberInArray {

	public static void main(String[] args) {
		int arr[]= {10,25,45,78,99,78,56};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
