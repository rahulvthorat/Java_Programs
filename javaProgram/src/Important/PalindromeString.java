package Important;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str="madam";
		String rev="";
		
		String org=str;
		
		int len=str.length();
		
		for(int i=len-1; i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(org.equals(rev))
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("No");
		}

	}

}
