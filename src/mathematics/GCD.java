package mathematics;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10,b=15;
		System.out.println(gcd(a,b));
		System.out.println(gcdEuclid(a,b));
		System.out.println(gcdOptimised(a,b));

	}
	
	//Basic gcd with TC =O(min(a,b))
	public static int gcd(int a , int b) {
		int result = Math.min(a, b);
		while(result>0) {
			if(a%result==0&&b%result==0)
				break;
			result--;
		}
		
		return result;
	}
	
	//Euclidean Algorithm solution
	public static int gcdEuclid(int a, int b) {
		while(a!=b) {
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
		
	}
	//Eculidean Algorithm optimised
	public static int gcdOptimised(int a, int b) {
		if(b==0)
			return a;
		else return gcdOptimised(b,a%b);
	}

}
