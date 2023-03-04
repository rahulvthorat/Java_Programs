package Important;

public class ReverseEachWorldInString {

	public static void main(String[] args) {
		String str = "welcome to java";
		String revword="";
		
		String[] words=str.split("\\s");
		
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			
			revword=revword+sb.toString();
		}
		
		System.out.println(revword);

	}

}
