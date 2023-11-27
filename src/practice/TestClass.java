package practice;

public class TestClass {

	public static void main(String[] args) {
		int []arr = {-2,1,-3,4,-1,2,1,-5,4};
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
