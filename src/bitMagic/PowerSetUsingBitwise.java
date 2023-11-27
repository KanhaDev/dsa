package bitMagic;

public class PowerSetUsingBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		int n = str.length();
		powerSet(str,n);

	}
	
	public static void powerSet(String str , int n)
	{
		int p = 1<<n;
		
		for(int i=0;i<p;i++) {
			for(int j =0;j<n;j++) {
				if((i&(1<<j))!=0)
					System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
	

}
