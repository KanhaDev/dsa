package arrays;

public class MaximumSumSubarray {

	//SubArrays of {1,2,3} are {1},{2},{3},{1,2},{2,3} and {1,2,3} 
	//{1,3} are not subArray because it is not contiguous
	public static void main(String[] args) {
		int []arr = {-3,8,-2,4,-5,6};
		System.out.println(maxSumSubarray(arr));

	}

	public static int maxSumSubarray(int[] arr)
	{
		int n =arr.length;
		int sum = 0,max =0;
		
		for(int i =0;i<n;i++) {
		sum = Math.max(sum+arr[i], arr[i]);
		max = Math.max(max, sum);
		}
			
		return max;
	}
}
