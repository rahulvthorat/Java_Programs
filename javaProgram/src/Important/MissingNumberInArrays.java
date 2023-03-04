package Important;

public class MissingNumberInArrays {

	public static void main(String[] args) {
		// Array should not have duplicate
				//array no need to be sorted order
				//value should be in range
				
				int a[]= {1,2,4,5};
				//1+2+3+5=11 sum1
				//1+2+3+4+5=15 sum2
				//sum2-sum1=15-11=4 missing
				
				int sum1=0;
				int sum2=0;
				
				for(int i=0; i<a.length; i++)
				{
					sum1=sum1+a[i];
					
				}
				System.out.println("sum of Arrays: " + sum1);
				
				
				for(int i=1; i<=5; i++)
				{
					sum2=sum2+i;
				}
				System.out.println("sum of Range in Arrays: " + sum2);
				System.out.println("Missing Number in Arrays:  " + (sum2-sum1));
			}

}
