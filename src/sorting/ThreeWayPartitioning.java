package sorting;

import java.util.Arrays;

public class ThreeWayPartitioning {

	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,2};
		//threeWay(arr);
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//Efficient Solution
	public static void sort(int[] arr)
	{
		int n = arr.length;
		int lo = 0 , mid = 0 , high = n-1;
		
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				int temp = arr[mid];
				arr[mid] = arr[lo];
				arr[lo] = temp;
				mid++;
				lo++;
			}
			else if(arr[mid]==2)
			{
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
			else
				mid++;
		}
	}
	
	//Naive Solution
	public static void threeWay(int[] arr)
	{
		int n = arr.length;
		int[] temp = new int[n];
		int i = 0;
		for(int j =0;j<n;j++)
		{
			if(arr[j]==0)
			{
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j =0;j<n;j++)
		{
			if(arr[j]==1)
			{
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j =0;j<n;j++)
		{
			if(arr[j]==2)
			{
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j =0;j<n;j++)
			arr[j] = temp[j];
	}

}
