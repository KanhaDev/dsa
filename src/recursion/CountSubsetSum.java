package recursion;

public class CountSubsetSum {

	public static void main(String[] args) {
		int [] arr = {1,2,1,2};
		int sum = 2;
		System.out.println(countSubset(arr , sum , 0 , 0));
		
	}
	
	private static int countSubset(int[] arr, int sum , int s , int i)
	{
		if(i == arr.length)
		{
			if(sum == s)
				return 1;
			return 0;
		}
		
		s += arr[i];
		
		int left = countSubset(arr, sum , s , i+1);
		
		s -= arr[i];
		
		int right = countSubset(arr, sum , s ,i+1);
		
		return left+right;
	}
	

}
