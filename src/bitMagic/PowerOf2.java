package bitMagic;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println(isPowerOf2(n));
		System.out.println(isPow2(n));
		System.out.println(isPower2(n));
		System.out.println(checkPower2(n));
	}

	// My first approach O((n)^(1/2)) Which is not a good solution
	public static boolean isPowerOf2(int n) {

		for (int i = 0; i * i <= n; i++) {
			if (n == Math.pow(2, i))
				return true;
		}
		return false;
	}

	// Naive Solution
	public static boolean isPow2(int n) {

		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	// Efficient Solution using Brian Kerningam's Algorithm

	public static boolean isPower2(int n) {

		int res =0;
		while(n>0) {
			n = (n&(n-1));
			res++;
		}
		if(res==1)
		return true;
		return false;
	}

	//Better Solution than above Since we have to check only one set bit
	//So by using BK algo when unsets bits then got result
	public static boolean checkPower2(int n) {

		if(n==0)
		return false;
		return ((n&(n-1))==0);
	}
}
