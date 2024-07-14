package fiveSix1;

public class Stringcount {

	public static void main(String[] args) {
		String str="vikas yadav vikas yadav i am am";
		String arr[]=str.split(" ");
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
					//arr[j]="0";
				}
			}
			if(count>1)
			{
				System.out.println(arr[i]);
			}
			
		}
		

	}

}
