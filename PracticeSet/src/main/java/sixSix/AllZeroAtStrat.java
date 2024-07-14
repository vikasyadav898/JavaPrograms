package sixSix;

public class AllZeroAtStrat {

	public static void main(String[] args) {
		int arr[]= {2,0,1,0,4,0,5,0,8,9};
		int arr1[]=new int[arr.length];
		int count=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr1[count--]=arr[i];
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

	}

	}


