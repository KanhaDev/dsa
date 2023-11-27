package sorting;

import java.util.Arrays;

public class MinimumDifference {

	public static void main(String[] args) {
		int[] arr = {15};
		System.out.println(minDiff(arr));
	}
	
	//Efficient Solution
	public static int minDiff(int[] arr)
	{
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i =1 ; i<arr.length;i++)
		{
			int diff = arr[i]-arr[i-1];
			min = Math.min(min, diff);
		}
		return min;
	}

}
