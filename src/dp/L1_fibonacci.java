package dp;

import java.util.Scanner;

public class L1_fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(topDown(n));
		sc.close();

	}
	static long topDown(int n) {
        long[] dp = new long[n+1];
        return  memoi(n,dp);
    }
    static long memoi(int n , long[] dp)
    {
        if(n<=1)
            return n;
        if(dp[n] != 0)
            return dp[n];
        return dp[n] = memoi(n-1,dp) + memoi(n-2,dp);
    }

}
