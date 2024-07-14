package sixSix;

public class AccendingArray {

	public static void main(String[] args) {
		int arr[]= {10,45,12,35,45,85,94,45};
		int temp=0;
		System.out.println("Old Array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("New Array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("Addition of max number"+(arr[0]+arr[1]));

	}

}
