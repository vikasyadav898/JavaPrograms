package array;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {10,45,63,78,96,52,12,36,74};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("Second largest number in array:"+arr[1]);

	}

}
