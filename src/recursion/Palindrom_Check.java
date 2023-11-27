package recursion;

public class Palindrom_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrom("geeks",4,0));

	}
	public static boolean isPalindrom(String str, int end,int start)
	{
		if(start>=end)
			return true;
		
		return str.charAt(end)==str.charAt(start) && isPalindrom(str,end-1,start+1);
	}

}
