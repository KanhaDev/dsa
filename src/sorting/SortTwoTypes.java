package sorting;

import java.util.Arrays;

public class SortTwoTypes {

	public static void main(String[] args) {
		int[] arr = {15,-3,-2,18};
		//segregatePosNeg(arr);
		//segPosNeg(arr);
		segNegPos(arr);
		System.out.println(Arrays.toString(arr));
	}

	//Naive SOlution
	public static void segregatePosNeg(int[] arr)
	{
		int n = arr.length;
		int[] temp = new int[n];
		int i = 0;
		for(int j =0;j<n;j++)
		{
			if(arr[j]<0)
			{
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j =0;j<n;j++)
		{
			if(arr[j]>=0)
			{
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j =0;j<n;j++)
			arr[j] = temp[j];
		
	}
	
	//Efficient Solution
	//Similar to Hoare's partition
	public static void segPosNeg(int[] arr)
	{
		int n = arr.length;
		int i = -1, j=n;
		while(true)
		{
			do {i++;}while(arr[i]<0);
			do {j--;}while(arr[j]>=0);
			if(i>=j)
				return;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	//Efficient Solution 
	//Similar to Lomuto's Partition
	public static void segNegPos(int[] arr)
	{
		int n = arr.length;
		int i = -1;
		for(int j =0;j<n;j++)
		{
			if(arr[j]<0)
			{
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
