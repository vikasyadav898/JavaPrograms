package sixEight;

public class EvenOddArray {

	public static void main(String[] args) {
		int arr[]= {5,3,6,9,7,5,3,8,4};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
