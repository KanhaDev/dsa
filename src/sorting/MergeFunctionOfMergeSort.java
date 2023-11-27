package sorting;

import java.util.Arrays;

public class MergeFunctionOfMergeSort {

	public static void main(String[] args) {
		int [] arr = {10,15,20,40,8,11,55};
		int low = 0,mid = 3, high = 6;
		merge(arr,low,mid,high);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void merge(int [] arr , int low , int mid , int high)
	{
		int [] left = new int [mid+1];
		int [] right = new int [high-mid];
		
		for(int i =0;i<=mid;i++)
		{
			left[i] =arr[i+low]; 
		}
		
		for(int i =0;i<high-mid;i++)
		{
			right[i] = arr[mid+1+i];
		}
		
		int i = 0 , j = 0;
		int k = 0;
		while(i<=mid && j<high-mid)
		{
			if(left[i]<=right[j])
			{
				arr[k] = left[i];
				k++;
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i<=mid)
		{
			arr[k] = left[i];
			k++;
			i++;
		}
		while(j<high-mid)
		{
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}
