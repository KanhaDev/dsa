package arrays;

public class MaximumConsecutive_1s {

	public static void main(String[] args) {
		int [] arr = {1,0,1,1,1,1,0,1,1};
		System.out.println(maxConsecutive(arr));

	}
	
	public static int maxConsecutive(int[] arr)
	{
		int n = arr.length;
		
		int res = 0,count =0;
		for(int i =0;i<n;i++)
		{
			if(arr[i]==1)
				res++;
			else
			{
				res = 0;
			}
			count = Math.max(count, res);
		}
		
		return count;
	}

}
