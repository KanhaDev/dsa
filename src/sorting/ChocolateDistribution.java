package sorting;

import java.util.Arrays;

public class ChocolateDistribution {

	public static void main(String[] args) {
		int[] arr = {7,3,2,4,9,12,56};
		int m = 3;
		System.out.println(chocoDist(arr,m));
	}
	
	public static int chocoDist(int[] arr, int m)
	{
		int n = arr.length;
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i =0;i<n-m+1;i++)
			min = Math.min(min, arr[m+i-1]-arr[i]);
		
		return min;
	}

}
