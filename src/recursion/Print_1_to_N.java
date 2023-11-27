package recursion;

public class Print_1_to_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1toN(7);

	}

	public static void print1toN(int n) {
		if (n == 0)
			return;

		print1toN(n - 1);
		System.out.print(n + " ");

	}

}
