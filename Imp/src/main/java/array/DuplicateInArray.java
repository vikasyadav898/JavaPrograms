package array;

public class DuplicateInArray {

	public static void main(String[] args) {
		int arr[]= {10,52,65,85,65,10,25};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
