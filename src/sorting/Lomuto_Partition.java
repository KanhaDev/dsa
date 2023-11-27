package sorting;

import java.util.Arrays;

public class Lomuto_Partition {

	public static void main(String[] args) {
		int[] arr = {10,80,20,90,40,50,70};
		int n = arr.length;
		lPartition(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}

	/* To handle the cases when pivot is not  the last element 
	 * swap(arr,p,h); 
	 * Then the pivot element will move to the last place and we can run normal partition */
	public static int lPartition(int[] arr, int l , int h)
	{
		int pivot = arr[h]; //Always last element will be pivot
		int i = l-1;
		for(int j =l;j<=h-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,h);
		
		return (i+1);
	}
	
	public static void swap(int[] arr , int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
