package six12;

public class AllZeroAtStrat {

	public static void main(String[] args) {
		int arr[]={1,0,3,5,0,8,0,9,0,7};
		int arr1[]=new int[arr.length];
		int count=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr1[count--]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}
