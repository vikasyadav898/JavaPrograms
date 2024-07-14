package array;

public class MaxinArray {

	public static void main(String[] args) {
		int arr[]= {10,23,52,65,45,78,12,3};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
			max=arr[i];
		}
		System.out.println(max);
	}

}
