package Important;

public class PrintUpperandLowerString {

	public static void main(String[] args) {
         
		
		String str="welcomeAKOLA";
		String upper="";
		String lower="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(65>=0 && ch<=90)
			{
				upper=upper+ch;
			}
			else
			{
				lower=lower+ch;
			}
		}
		
		System.out.println("upper String:"+upper);
		System.out.println("lower String:"+lower);

	}

}
