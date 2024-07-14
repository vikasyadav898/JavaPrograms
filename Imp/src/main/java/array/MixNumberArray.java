package array;

public class MixNumberArray {

	public static void main(String[] args) {
		int arr[]= {10,25,45,78,99,78,56};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
