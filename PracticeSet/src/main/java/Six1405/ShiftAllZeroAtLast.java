package Six1405;

public class ShiftAllZeroAtLast {

	public static void main(String[] args) {
		int arr[]= {1,2,0,1,0,5,0,3,0,8,0,7};
		int arr1[]=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr1[count++]=arr[i];
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}

}
