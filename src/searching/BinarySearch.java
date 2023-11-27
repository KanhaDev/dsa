package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60};
		int x = 20;
		System.out.println(bsearch(arr,x));
		System.out.println(bSearch(arr,0,arr.length-1,x));

	}
	
	//Iterative Binary search
	public static int bsearch(int []arr , int x)
	{
		int low = 0;
		int high = arr.length-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(x==arr[mid])
				return mid;
			else if(x>arr[mid])
				low = mid+1;
			else
				high = mid-1;
		}
		return -1;
	}
	
	//Recursive Binary Search
	
	public static int bSearch(int [] arr, int low , int high , int x)
	{
		if(low>high)
			return -1;
		
		int mid = (low+high)/2;
		if(arr[mid]==x)
			return mid;
		else if(arr[mid]>x)
			return bSearch(arr,low,mid-1,x);
		else
			return bSearch(arr,mid+1,high,x);
		
		
	}
}
