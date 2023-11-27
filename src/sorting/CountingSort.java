package sorting;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
	
		int[] arr = {1,4,4,1,0,1};
		int k =5;
		countSort(arr , k);
		System.out.println(Arrays.toString(arr));
	}
	public static void countSort(int[] arr, int k)
	{
		int n = arr.length;
		int[] count = new int[k];
		for(int i =0;i<n;i++)
			count[arr[i]]++;
		int index = 0;
		for(int i =0;i<k;i++)
		{
			for(int j =0;j<count[i];j++)
			{
				arr[index] = i;
				index++;
			}
		}
	}

}
