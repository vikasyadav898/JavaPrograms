package array;

public class MinNumberArray {

	public static void main(String[] args) {
		int arr[]= {10,52,78,56,45,25,98,12};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
