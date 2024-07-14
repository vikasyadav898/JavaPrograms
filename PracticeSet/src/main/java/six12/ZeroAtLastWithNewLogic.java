package six12;

public class ZeroAtLastWithNewLogic {

	public static void main(String[] args) {
		int arr[]= {1,0,2,5,0,3,0,2,0,8,0,9};
		int arr1[]=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr1[count++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}
