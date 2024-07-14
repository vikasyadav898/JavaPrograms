package array;

import java.util.Arrays;

public class InbuildFuctionArray {

	public static void main(String[] args) {
		int arr[]= {2,5,9,6,3,7,8,6};
		System.out.println(Arrays.toString(arr));
		//using sorting array
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
