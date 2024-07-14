package sixSix;

public class FindMixAndMax {

	public static void main(String[] args) {
		int arr[]= {5,8,6,9,7,10,3,0};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
