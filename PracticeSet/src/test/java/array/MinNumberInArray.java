package array;

public class MinNumberInArray {

	public static void main(String[] args) {
		int arr[]= {10,23,52,65,45,78,12,3};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
