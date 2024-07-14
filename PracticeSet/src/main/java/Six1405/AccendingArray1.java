package Six1405;

public class AccendingArray1 {

	public static void main(String[] args) {
		int arr[]= {13,25,10,36,45,78,97};
		int temp=0;
		System.out.println("old Array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("new Array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("Sum of two numbers"+(arr[0]+arr[1]));
		
		

	}

}
