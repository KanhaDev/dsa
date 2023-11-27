package sorting;

import java.util.Arrays;

public class Partition_Naive {

	public static void main(String[] args) {
		int[] arr = {3,8,6,12,10,7};
		int p = 5;
		int n = arr.length;
		partition(arr,0,n-1,p);
		System.out.println(Arrays.toString(arr));

	}
	
	//Naive Solution
	private static void partition(int[] arr, int l , int h , int p)
	{
		int[] temp = new int [h-l+1];
		int index = 0;
		for(int i =l;i<=h;i++)
			if(arr[i]<=arr[p])
				temp[index++] = arr[i];
		for(int i =l;i<=h;i++)
			if(arr[i]>arr[p])
				temp[index++] = arr[i];
		for(int i =0;i<h-l+1;i++)
			arr[i] = temp[i-l];
	}

}
