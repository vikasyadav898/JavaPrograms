package Six1405;

public class DuplicateInArray {

	public static void main(String[] args) {
		int arr[]= {13,25,10,36,45,78,25};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
