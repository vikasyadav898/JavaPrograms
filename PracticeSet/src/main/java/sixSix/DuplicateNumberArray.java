package sixSix;

public class DuplicateNumberArray {

	public static void main(String[] args) {
		int arr[]= {10,52,10,36,12,52,45,75,95,12};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
