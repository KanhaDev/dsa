package mathematics;

public class CheckPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =36763;
		System.out.println(palindrom(n));

	}
	public static boolean palindrom(int n) {
		int rev=0,temp=n,rem;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		
		return (n==rev);
	}

}
