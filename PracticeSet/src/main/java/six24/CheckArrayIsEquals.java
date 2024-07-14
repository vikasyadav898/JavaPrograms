package six24;

import java.util.Arrays;

public class CheckArrayIsEquals {

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,8,0,3,0,7,0,8};
		int arr1[]= {1,0,2,0,8,0,3,0,7,0,8};
		if(Arrays.equals(arr, arr1))
		{
			System.out.println("Both are equals");
		}
		else {
			System.out.println("Both are not equals");
		}

	}

}
