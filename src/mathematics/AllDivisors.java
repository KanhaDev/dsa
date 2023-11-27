package mathematics;

public class AllDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		printAllDivisors(n);
		System.out.println();
		printDivisors(n);
		System.out.println();
		printDivisors1(n);
	}

	public static void printAllDivisors(int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.print(i + " ");
		}
	}

	// Efficient solution but not in order
	public static void printDivisors(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				if (i != n / i)
					System.out.print(n / i + " ");
			}
		}
	}

	// Efficient Solution in order
	public static void printDivisors1(int n) {
		int i;
		for( i=1;i*i<n;i++)
			if(n%i==0) 
				System.out.print(i+" ");
			
		for(;i>=1;i--)
			if(n%i==0)
				System.out.print(n/i+" ");
		
	}

}
