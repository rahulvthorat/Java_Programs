package Important;

import java.util.Scanner;

public class LargestOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Frist Number");
		int a=sc.nextInt();
		
		//System.out.println("Enter Second Number");
		int b=sc.nextInt();
		
		//System.out.println("Enter Third Number");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("Largest Number is:A"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest Number is:B"+b);
		}
		else
		{
			System.out.println("Largest Number is:C"+c);
		}

	}

}
