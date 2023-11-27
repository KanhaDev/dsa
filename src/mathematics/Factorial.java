package mathematics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6;
		System.out.println(factorialIterative(n));
		System.out.println(factorialRecursive(n));
	}

	public static int factorialIterative(int n) {
		int fact = 1;

		for (int i = n; i > 0; i--) {
			fact *= i;
		}

		return fact;
	}

	public static int factorialRecursive(int n) {

		if (n == 0)
			return 1;
		return n * factorialRecursive(n - 1);
	}

}
