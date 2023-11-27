package mathematics;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b = 84;
		System.out.println(lcm(a, b));
		System.out.println(effectiveLcm(a, b));
	}

	public static int lcm(int a, int b) {
		int res = Math.max(a, b);
		while (res<=a*b) {
			if( res%a == 0 && res%b == 0)
				break;
			res++;
		}
		return res;
	}
	//For efficient solution
	public static int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	public static int effectiveLcm(int a , int b) {
		return (a*b)/gcd(a,b);
	}

}
