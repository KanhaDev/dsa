package mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 31;
		printPrimeNumbers(n);
		System.out.println();
		sieve(n);
		System.out.println();
		sieve2(n);
	}

	public static void printPrimeNumbers(int n) {
		for (int i = 2; i <= n; i++) {
			if (CheckPrime.isPrime2(i))
				System.out.print(i + " ");
		}

	}

	public static void sieve(int n) {
		boolean[] isPrime = new boolean[n + 1];
		// To fill all the values of array elements with true
		Arrays.fill(isPrime, true);
		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = 2 * i; j <= n; j = j + i)
					isPrime[j] = false;
			}
		}
		for (int i = 2; i <= n; i++) {
			if (isPrime[i])
				System.out.print(i + " ");
		}

	}
	
	//Optimized solution
	public static void sieve2(int n) {
		boolean[] isPrime = new boolean[n + 1];
		// To fill all the values of array elements with true
		Arrays.fill(isPrime, true);
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
				for (int j = i * i; j <= n; j = j + i)
					isPrime[j] = false;
			}
		}
		
		
	}

}
