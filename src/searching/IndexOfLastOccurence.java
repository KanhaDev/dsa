package searching;

public class IndexOfLastOccurence {

	public static void main(String[] args) {
		int [] arr = {10,15,20,20,40,40};
		int x = 40;
		System.out.println(lastOccurence(arr,x));
		System.out.println(lastOccurence(x,arr));

	}
	
	//Naive Solution
	public static int lastOccurence(int[] arr, int x)
	{
		for(int i=arr.length-1;i>=0;i--)
			if(arr[i]==x)
				return i;
		return -1;
	}
	
	//Efficient Solution
	
	public static int lastOccurence( int x , int [] arr)
	{
		int low = 0 ;
		int high = arr.length-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid]>x)
				high = mid-1;
			else if(arr[mid]<x)
				low = mid+1;
			else
			{
				if(mid==arr.length-1 || arr[mid]!=arr[mid+1])
					return mid;
				else
					low = mid+1;
			}
		}
		
		return -1;
	}
	
}
