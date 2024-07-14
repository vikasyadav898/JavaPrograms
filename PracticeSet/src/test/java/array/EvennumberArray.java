package array;

public class EvennumberArray {

	public static void main(String[] args) {
		int arr[]= {10,25,45,63,98,89,62};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}

	}

}
