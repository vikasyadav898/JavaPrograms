package Test;

public class MinMaxArray {

	public static void main(String[] args) {
		int[]arr= {5,7,9,3,6,4,2};
		int min=arr[0];
		int second=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
			{
				min=arr[i]	;
				second=arr[i]+1;
			}
		}
		System.out.println(min+second);
	}

}
