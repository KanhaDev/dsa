package recursion;

public class Sum_Of_Natural_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getSum(4));
	}

	private static int getSum(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 0;
		
		return n+getSum(n-1);
	}

}
