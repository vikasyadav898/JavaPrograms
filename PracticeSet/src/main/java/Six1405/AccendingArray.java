package Six1405;

public class AccendingArray {

	public static void main(String[] args) {
		int arr[]= {10,52,10,45,25,45,85,96,12};
		int temp=0;
//		System.out.println("Old Array is: ");
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		if(arr[0]!=arr[1]) {
		System.out.println(arr[1]);
		}
		else
		{
			System.out.println(arr[2]);
		}

	}

}
