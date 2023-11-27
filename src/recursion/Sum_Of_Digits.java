package recursion;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		int n = 9987;
		System.out.println(digitSum(n));

	}

	public static int digitSum(int n)
	{
		if(n==0)
			return 0;
		else
		return n%10+digitSum(n/10);
	}
}
