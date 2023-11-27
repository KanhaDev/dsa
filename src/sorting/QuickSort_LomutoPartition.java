package sorting;

import java.util.Arrays;
import static sorting.Lomuto_Partition.*;

public class QuickSort_LomutoPartition {

	public static void main(String[] args) {
		int[] arr = {8,4,7,9,3,10,5};
		int n = arr.length;
		qSortLomuto(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void qSortLomuto(int[] arr , int l ,int h)
	{
		if(l<h)
		{
			int p = lPartition(arr,l,h);
			qSortLomuto(arr,l,p-1);
			qSortLomuto(arr,p+1,h);
		}
	}

}
