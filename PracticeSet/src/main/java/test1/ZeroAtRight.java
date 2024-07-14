package test1;

public class ZeroAtRight {

	public static void main(String[] args) {
		int[] arr= {14, 0, 5, 2, 0, 3, 0};
		int temp=0;
		System.out.println("Original array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
			
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+i;j<arr.length;j++)
			{
				if(arr[i]!=0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
					
				}
			}
		}
		System.out.print("New array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}

	}

}
