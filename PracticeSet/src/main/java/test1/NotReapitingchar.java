package test1;

public class NotReapitingchar {

	public static void main(String[] args) {
		String str="vikasyadavshankar";
		
		for(int i=0;i<str.length();i++)
		{
			boolean status=true;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					status=false; 		
				}
			}
			if(status)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
