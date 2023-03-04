package Important;

public class CountUpperandLowerString {

	public static void main(String[] args) {
		String str="AKLatm";
		
		int upper=0;
		int lower=0;
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65  && ch<=90)
			{
				upper++;
			}
			else
			{
				lower++;
			}
			
			
		}
		
		System.out.println("upperString:"+upper);
		System.out.println("lowerString:"+lower);
	}

}
