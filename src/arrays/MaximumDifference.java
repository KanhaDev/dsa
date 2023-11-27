package arrays;

public class MaximumDifference {

	public static void main(String[] args) {
		int [] arr = {2,3,10,6,4,8,1};
		System.out.println(maxDiff(arr));
		System.out.println(maxDifference(arr));
	}

	//Naive Solution Time Complexity = O(n^2);
	public static int maxDiff(int [] arr)
	{
		int n = arr.length,max =0;
		for(int i =0;i<n;i++)
			for(int j =i+1;j<n;j++)
				if(max<(arr[j]-arr[i]))
					max = arr[j]-arr[i];
		return max;	
	}
	
	//Efficient Solution Time Complexity = 0(n)
	public static int maxDifference(int [] arr)
	{
		int n = arr.length;
		int max =arr[1]-arr[0],minVal = arr[0];
		for(int j=1;j<n;j++)
		{
			max = Math.max(max,arr[j]-minVal);
			minVal = Math.min(minVal, arr[j]);
		}
		return max;
	}
}
