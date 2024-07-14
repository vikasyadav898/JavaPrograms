package array;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {
		int arr[]= {1,5,6,7};
		int arr1[]= {1,5,6,9};
		if(Arrays.equals(arr, arr1)) {
			System.out.println("Given Two Array is equals");
		}
		else
		{
			System.out.println("Given Two Array is not equals");
		}

	}

}
