package array;

public class ZerAtStart {

	public static void main(String[] args) {
		int arr[]= {1,0,3,0,5,0,7,0,8,9};
		int arr1[]=new int[arr.length];
		int count=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr1[count]=arr[i];
				count--;
			}
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}

	}

}
