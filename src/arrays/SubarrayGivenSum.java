package arrays;

public class SubarrayGivenSum {

	public static void main(String[] args) {
		int [] arr = {2,4};
		int sum = 3;
		System.out.println(isSubarray(arr,sum));
	}
	
	private static boolean isSubarray(int [] arr, int sum)
	{
		int n = arr.length;
		int curr = 0;
		int s =0;
		for(int e = 0;e<n;e++)
		{
			curr+=arr[e];
			while(curr>sum)
			{
				curr-=arr[s];
				s++;
			}
			if(curr==sum)
				return true;
		}
		return false;
	}

}
