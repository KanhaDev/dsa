package recursion;

public class GenerateSubset {

	public static void main(String[] args) {
		
		String str = "ABC";
		
		subset(str," ",0);
		

	}
	
	public static void subset(String s , String curr,int i) {
		if(i==s.length())
		{
			System.out.println(curr);
			return;
		}
		subset(s,curr,i+1);
		subset(s,curr+s.charAt(i),i+1);
	}

}
