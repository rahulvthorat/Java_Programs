package Important;

import java.util.Arrays;

public class ByName {

	public static void main(String[] args) {
	
   // 1. Arrays.sort(ArrayName) :void method which we can use to sort any array in ascending order.
		
		int arr[] = {5,6,4,1,2,3};
		
		Arrays.sort(arr);
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
