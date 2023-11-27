package mathematics;

public class ComputingPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 2,n=3;
		System.out.println(power(x,n));
		System.out.println(powerIter(x,n));
		System.out.println(powerIter2(x,n));
	}

	public static int power(int x , int n) {
		int res = 1;
		for(int i=1;i<=n;i++) {
			res = res*x;
		}
		return res;
	}
	
	//Iterative Solution for Power
	
	public static int powerIter(int x , int n) {
		int res = 1;
		while(n>0) {
			if(n%2!=0)
				res = res*x;
			x=x*x;
			n=n/2;
		}
		return res;
	}
	
	//Can optimize the above solution by changing some bit manipulation
	public static int powerIter2(int x , int n) {
		int res = 1;
		while(n>0) {
			if(n%2!=0)
				res = res*x;
			x=x*x;
			n=n>>1;
		}
		return res;
	}
}
