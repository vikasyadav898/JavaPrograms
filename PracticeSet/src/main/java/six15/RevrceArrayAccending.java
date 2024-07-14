package six15;

public class RevrceArrayAccending {

	public static void main(String[] args) {
		int arr[]= {10,56,85,35,12,78,9};
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
		System.out.println(arr[1]);

	}

}
