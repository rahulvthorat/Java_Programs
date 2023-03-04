package Important;

public class DuplicatInArrays {

	public static void main(String[] args) {
		String arr[]= {"java","c++","c+","python"};
       
		//Approach1		
		boolean flag=false;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length; j++ )
			{
				if(arr[i]==arr[j])
				{
					System.out.println("found duplicate element:"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("duplicate element not found :");
		}
		
		
          //Approach2: Hashset
       
		/*HashSet <String> langs=new HashSet();
		langs.add("java");
	    langs.add("c++");
		langs.add("java");
		boolean flag=false;
		for(String l:langs)
		{
			
			if(langs.add(l)==false)
			{
				System.out.println("found duplicate:"+l);
				 flag=true ;
			}
		}
		if( flag==false)
		{
			System.out.println(" not found duplicate:");
		}*/
		

		}

	}


