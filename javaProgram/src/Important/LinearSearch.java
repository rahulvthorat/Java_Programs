package Important;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int Search_element=40;
		
		boolean flage=true;
		
		for(int i=0;i<a.length;i++)
		{
			if(Search_element==a[i])
			{
				System.out.println("found:" +i);
				flage=true;
				break;
			}
		}
		if(flage=false)
		{
			System.out.println("Not Found");
		}
	}

}
