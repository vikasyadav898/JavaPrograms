package six12;

import java.util.Arrays;

public class ZeroAtStart {

	public static void main(String[] args) {
		int arr[]= {0,2,0,5,3,0,8,0,9};
		int j=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[j--]=arr[i];
			}
		}
		for(int i=0;i<j;i++) {
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));

	}
	

}
