package Important;

import java.util.Scanner;

public class LongestSubStrings {
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
       
		    String str=sc.next();
	        int len = str.length();
			int length = 0;
			for(int i = 0; i < len; i++)
			{
				boolean[] visited = new boolean[256];
				
				for(int j = i; j < len; j++)
				{
					if (visited[str.charAt(j)] == true)
						break;

					else
					{
						length = Math.max(length, j - i + 1);
						visited[str.charAt(j)] = true;
					}
				}

				
				visited[str.charAt(i)] = false;
			}
			System.out.println("the length of the longest substring without repeating characters:" + length);
			
		}
	}
 
 


	

