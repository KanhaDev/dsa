package mathematics;

public class TrailingZeroInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		//System.out.println(trailZero(n));
		System.out.println(countTrailingZero(n));

	}

	public static int trailZero(int n) {
		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact *= i;
		}
		//System.out.println(fact);
		
		int count = 0;

		while (fact % 10 == 0) {
			count++;
			fact /= 10;
		}
		return count;
	}
	
	//Optimized way of counting trailing zero of given factorial
	public static int countTrailingZero(int n) {
		int res = 0;
		for(int i=5;i<=n;i*=5)
		res+=(n/i);
		return res;
		
	}

}
