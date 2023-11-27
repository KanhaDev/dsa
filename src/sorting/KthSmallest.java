package sorting;

import java.util.Arrays;
import static sorting.Lomuto_Partition.*;

public class KthSmallest {

	public static void main(String[] args) {
		int[] arr = {30,20,5,10,8};
		int k = 4;
		System.out.println(kthSmallest(arr,k));
		System.out.println(kthSmallestElem(arr,k));
	}

	//Naive Solution  Time: O(n log n)
	public static int kthSmallest(int[] arr , int k)
	{
		Arrays.sort(arr);
		return arr[k-1];
	}
	
	//Efficient Solution
	
	public static int kthSmallestElem(int[] arr , int k)
	{
		int n = arr.length;
		int low = 0 , high = n-1;
		while(low<= high)
		{
			int p = lPartition(arr,low,high);
			
			if(p == k-1)
				return arr[p];
			else if(p>k-1)
				high = p-1;
			else
				low = p+1;
		}
		return -1;
	}
}
