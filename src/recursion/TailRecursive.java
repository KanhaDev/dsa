package recursion;

public class TailRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fun(7,1);
		System.out.println();
		System.out.println(fact(6));
		System.out.println(fact2(6,1));
	}
	
	
	//print from 1 to N
	//Converting non tail recursion to Tail Recursion
	public static void fun(int n, int k)
	{
		if(n==0)
			return;
		
		System.out.print(k+" ");
		fun(n-1,k+1);
	}

	//Factorial of a number
	//This is not tail recursive 
	public static int fact(int n)
	{
		if(n==0||n==1)
			return 1;
		return n*fact(n-1);
	}
	
	//Tail Recursive factorial of a number
	//Initially pass k = 1
	public static int fact2(int n,int k)
	{
		if(n==0||n==1)
			return k;
		
		return fact2(n-1,k*n);
	}
}
