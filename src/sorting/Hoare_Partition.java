package sorting;

import java.util.Arrays;

public class Hoare_Partition {

	public static void main(String[] args) {
		int[] arr = {5,3,8,4,2,7,1,10};
		int n = arr.length;
		hPartition(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}

	public static int hPartition(int[] arr , int l , int h)
	{
		int pivot = arr[l]; //First Element as Pivot element
		int i = l-1 , j = h+1 ;
		
		while(true)
		{
			do {
				i++;
			}while(arr[i]<pivot);
				
			do {
				j--;
			}while(arr[j]>pivot);
			if(i>=j)
				return j;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;	
		}
	}
}
