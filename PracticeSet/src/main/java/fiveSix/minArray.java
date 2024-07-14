package fiveSix;

public class minArray {

	public static void main(String[] args) {
		int arr[]= {10,5,6,8,6,4,2,1,-9};
		int min=arr[0];
		int min1=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
