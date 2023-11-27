package searching;

public class SearchInSortedRotated {

	public static void main(String[] args) {
		int []arr = {10,20,30,40,50,8,9};
		int x = 30 ;
		System.out.println(search(arr,x));
		System.out.println(search1(arr,x));
	}
	
	//Naive solution O(n)
	public static int search(int [] arr , int x)
	{
		int n = arr.length;
		for(int i =0;i<n;i++)
			if(arr[i]==x)
				return i ;
		return -1;
	}
	
	//Efficient Solution O(log n)
	public static int search1(int [] arr, int x)
	{
		int n = arr.length;
		int high = n-1 , low = 0;
		while(high>=low)
		{
			int mid = (low+high)/2;
			
			if(arr[mid]==x)
				return mid;
			//Left Half sorted
			if(arr[mid]>=arr[low])
			{
				if(x>=arr[low] && arr[mid]>x)
					high = mid-1;
				else
					low = mid+1;	
			}
			//Right Half sorted
			else {
				if(x>=arr[mid] && x<=arr[high])
				low =mid+1;
				else
				high = mid-1;
			}
		}
		
		return -1;
	}

}
