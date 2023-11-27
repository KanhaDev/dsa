package mathematics;

import mathematics.CheckPrime;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1098;
		primeFactors(1098);
		System.out.println();
		printPrimeFactors(n);
		System.out.println();
		printPrimeFactors1(n);

	}

	public static void primeFactors(int n) {
		for (int i = 2; i < n; i++) {
			if (CheckPrime.isPrime2(i)) {
				int x = i;
				while (n % x == 0) {
					System.out.print(i + " ");
					x = x * i;
				}

			}
		}
	}

	// Efficient Solution
	public static void printPrimeFactors(int n) {
		if (n <= 1)
			return;
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
		if (n > 1)
			System.out.print(n);
	}

	// More Effective Solution

	public static void printPrimeFactors1(int n) {
		if (n <= 1)
			return;
		while (n % 2 == 0) {

			System.out.print(2);
			n = n / 2;
		}
		while (n % 3 == 0) {

			System.out.print(" " + 3);
			n = n / 3;
		}

		for (int i = 5; i * i <= n; i = i + 6) {
			while (n % i == 0) {

				System.out.println(" " + i);
				n = n / i;
			}
			while (n % (i + 2) == 0) {

				System.out.print(" " + (i + 2));
				n = n / (i + 2);
			}

		}
		if (n > 3)
			System.out.print(" " + n);
	}

}
