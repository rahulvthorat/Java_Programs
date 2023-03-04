package Important;

import java.util.Arrays;

public class SortingElement {

	public static void main(String[] args) {
		int arr[]= {30,40,50,20,10};
		System.out.println("before sort"+Arrays.toString(arr));
		
		Arrays.parallelSort(arr);
		
		System.out.println("After sort"+Arrays.toString(arr));

	}

}
