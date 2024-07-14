package Six1405;

public class MaxnumberOfArray {

	public static void main(String[] args) {
		int arr[]= {10,22,55,96,78,99,23};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
