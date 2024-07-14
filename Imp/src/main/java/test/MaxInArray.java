package test;

public class MaxInArray {

	public static void main(String[] args) {
		int arr[]= {10,20,52,89,88,96,11};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		System.out.println("maximum number in array is: "+max);
		
		}

}
