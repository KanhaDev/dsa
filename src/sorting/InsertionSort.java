package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int [] arr = {20,5,40,60,10,30};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void insertionSort(int [] arr)
	{
		int n = arr.length;
		for(int i = 1 ;i<n;i++)
		{
			int key = arr[i];
			int j =i-1;
			//If we put equality sign in arr[j]>=key then stability of this algorithm will loss
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}
