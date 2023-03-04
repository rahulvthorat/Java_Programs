package Important;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]= {5,2,6,7,9};
		
		int sum=0;
		
		/*for(int v:arr)
		{
			sum=sum+v;
			
		}
		
		System.out.println(sum);*/
		
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println(sum);

	}
}
