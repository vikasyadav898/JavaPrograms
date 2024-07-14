package sixEight;

public class MinMaxOfArray {

	public static void main(String[] args) {
		int arr[]= {1,2,6,-9,7,5,6,3};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

} 
