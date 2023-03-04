package Important;

import java.util.Arrays;

public class EqualArrays {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,4,5,6};
		//Approach1
		/*boolean status=Arrays.equals(a1, a2);
		if(status==true)
		{
			System.out.println("Arrays Equals");
		}
		else
		{
			System.out.println("Not Equals");
		}*/
		
		//Approach2
		boolean status=true;
		
		if(a1.length==a2.length)
		{
			for(int i=0; i<a1.length; i++ )
			{
				if(a1[i] !=a2[i])
				{
					status=false;
				}
			}
		}
		else
		{
			status=false;
		}
		if(status==true)
		{
			System.out.println("Array Are Equals");
		}
		else
		{
			System.out.println("Array Are not Equals");
		
		}
		
	}

}
