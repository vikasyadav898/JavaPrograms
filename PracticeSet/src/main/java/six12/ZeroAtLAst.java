package six12;

import java.util.Arrays;

public class ZeroAtLAst {

	public static void main(String[] args) {
		int arr[]= {0,2,0,5,3,0,8,0,9};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		}
		for(int i=j;i<arr.length;i++) {
			arr[i]=0;
		
		}
		
		System.out.println("All zero at last"+Arrays.toString(arr));
}

}
