package Important;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num =121;
		int rev=0;
		int org=num;
		
		while(num!=0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		
		if(org==rev)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
