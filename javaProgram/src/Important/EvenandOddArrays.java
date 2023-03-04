package Important;

public class EvenandOddArrays {

	public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6};
        
        
       //Enhanced for loop
        
        for (int value:a)
        {
       	 if(value%2==0)
       	 System.out.println("Even:"+value);
        }
        
       
        for(int value:a)
        {
       	 if(value%2!=0)
       		 System.out.println("Odd:"+value);
        }
		
		
        //Extracting even number
		
		/*
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}*/

		
        

	}

}
