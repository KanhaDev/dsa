package sorting;

import java.util.Arrays;
import static sorting.Hoare_Partition.*;

public class QickSort_HoarePartition {

	public static void main(String[] args) {
		int[] arr = {8,4,7,9,3,10,5};
		int n = arr.length;
		qSortHoare(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void qSortHoare(int[] arr , int l , int h)
	{
		if(l<h)
		{
			int p = hPartition(arr ,l ,h);
			qSortHoare(arr,l,p);
			qSortHoare(arr,p+1,h);
		}
	}
	
	//Java does not support goto , there is no tail call optimization
	
//	public static void qSortHoareTail(int[] arr , int l , int h)
//	{
//	start:
//		if(l<h)
//		{
//			int p = hPartition(arr ,l ,h);
//			qSortHoare(arr,l,p);
//			l = p+1;
//			goto start ;
//		}
//	}
}
