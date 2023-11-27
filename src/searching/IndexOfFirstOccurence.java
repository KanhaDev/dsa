package searching;

public class IndexOfFirstOccurence {

	public static void main(String[] args) {
		int [] arr = {1,10,10,10,20,20,40};
		int x = 10;
		System.out.println(firstOccurence(arr,x));
		System.out.println(firstOccurence(arr,0,arr.length-1,x));
	}
	
	//Naive Solution Time = O(n)
	public static int firstOccurence(int [] arr , int x)
	{
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	
	//Efficient Solution

	public static int firstOccurence(int[] arr, int low , int high , int x)
	{
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		
		if(arr[mid]>x)
			return firstOccurence(arr,low,mid-1,x);
		else if(arr[mid]<x)
			return firstOccurence(arr,mid+1,high,x);
		else
		{
			if(mid==0 || arr[mid]!=arr[mid-1])
				return mid;
			else
				return firstOccurence(arr,low,mid-1,x);
		}
	}
}
