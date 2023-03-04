package Important;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		//Arrays.equals(ArrayVar1,ArrayVar2) :
		//Returns boolean , we can use this method to compare the array
		//elements are similar for two different arrays or not.

		
		int arr1[] = {1,8,3,4,5};
		int arr2[] = {1,8,3,4,5};  

		       if(Arrays.equals(arr1, arr2))
		          {
		           System.out.println("Equal");
		          }
		       else
		          {
		           System.out.println("Not equal");
		          }

	}

}
