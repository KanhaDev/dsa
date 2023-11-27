package recursion;

public class Print_N_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printNto1(7));
		printN_1(7);

	}

	// First Approach
	public static int printNto1(int n) {

		if (n == 1)
			return 1;
		else {
			System.out.print(n + " ");
			return printNto1(n - 1);
		}
	}

	// Second Approach

	public static void printN_1(int n) {

		if (n == 0)
			return;

		System.out.print(n + " ");
		printN_1(n-1);

	}
}
