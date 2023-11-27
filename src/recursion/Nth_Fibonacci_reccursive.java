package recursion;

public class Nth_Fibonacci_reccursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fib(4));
	}
	
	public static int fib(int n)
	{
		
		// Or we can write it as if(n<=1) return n;
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		return fib(n-1)+fib(n-2);
	}

}
