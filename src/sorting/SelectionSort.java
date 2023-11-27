package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr = {8,5,10,2,20,18};
		//selectSort(arr);
		selectSort1(arr);
		System.out.println(Arrays.toString(arr));
	}

	//Naive implementation
	public static void selectSort(int[] arr) {
		int n = arr.length;
		int [] temp = new int[n];
		
		for(int i =0;i<n;i++)
		{
			int min_idx = 0;
			for(int j =1;j<n;j++)
				if(arr[j]<arr[min_idx])
					min_idx = j;
			temp[i] = arr[min_idx];
			arr[min_idx] = Integer.MAX_VALUE;
 		}
		
		for(int i =0;i<n;i++)
			arr[i] = temp[i];	
	}
	
	//Efficient Implementation
	
	public static void selectSort1(int [] arr)
	{
		int n = arr.length;
		
		for(int i =0;i<n-1;i++)
		{
			int min = arr[i];
			int min_idx = i;
			for(int j =i+1;j<n;j++)
			{
				if(arr[j]<min)
				{
					min = arr[j];
					min_idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp; 
		}
		
	}
	

}
