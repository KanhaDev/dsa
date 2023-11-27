package sorting;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {10,15,50,4,20};
		heapSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void heapSort(int[] arr)
	{
		int n = arr.length;
		buildHeap(arr);
		for(int i = n-1;i>=1;i--)
		{
			swap(arr,i,0);
			maxHeapify(arr,i,0);
		}
	}
	public static void buildHeap(int[] arr) {
		int n = arr.length;
		for(int i = ((n-2)/2);i>=0;i--)
				maxHeapify(arr,n,i);
	}
	public static void maxHeapify(int[] arr, int n, int i)
	{
		int largest = i , left = 2*i+1 ,right = 2*i+2;
		if(left<n && arr[left]>arr[largest])
			largest = left;
		if(right<n && arr[right]>arr[largest])
			largest = right;
		if(largest != i)
		{
			swap(arr,i,largest);
			maxHeapify(arr,n,largest);
		}
	}
	public static void swap(int[] arr , int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
