package arrays;

public class MaximumSum_K_Elem {

	public static void main(String[] args) {
		int [] arr = {1,8,30,-5,20,7};
		int k =3;
		System.out.println(maxSum(arr,k));
		System.out.println(maxSum2(arr,k));

	}
	//Efficient Solution O(n) Time
	private static int maxSum2(int [] arr , int k)
	{
		int n = arr.length;
		int curr = 0;
		for(int i=0;i<k;i++)
			curr+=arr[i];
		int res = curr;
		for(int i =k;i<n;i++)
		{
			curr = curr+arr[i]-arr[i-k];
			res = Math.max(curr, res);
		}
		return res;
	}
	
	//Naive Solution O(n^2) Time
	private static int maxSum(int [] arr, int k)
	{
		int n = arr.length;
		int res = Integer.MIN_VALUE;
		for(int i =0;i+k-1<n;i++)
		{
			int curr =0;
			for(int j =0;j<k;j++)
			{
				curr = curr+arr[i+j];
			}
			res = Math.max(res, curr);
		}
		
		return res;
	}

}
