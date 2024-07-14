package array;

public class OddArray {

	public static void main(String[] args) {
		int arr[]= {1,5,8,9,6,5,4,2,4,5,8,6,3};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
