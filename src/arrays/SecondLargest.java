package arrays;


public class SecondLargest {

	
	public static void main(String[] args) {
		
		int[] arr = { 20, 10, 5, 20, 8 ,12};
		System.out.println(secondLargestIndex(arr));

	}

	/* Naive Approach
	public static int secondLargestIndex(int[] arr, int n) {
		int max = largestElem(arr,n),second = -1;
		for (int i = 1; i < n; i++)
			if (arr[max] != arr[i])
			{
				if(second==-1)
					second =i;
				if(arr[i]>arr[second])
					second = i;
			}
		return second;
	}
	public static int largestElem(int[] arr, int n) {
		int max = 0;
		for (int i = 1; i < n; i++)
			if (arr[max] < arr[i])
				max = i;
		return max;
	}*/
	
	public static int secondLargestIndex(int [] arr)
	{
		int n = arr.length;
		int max =0,second =-1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[max])
			{
				max = i;
				second = max;
			}
			else if(arr[i]!=arr[max])
			{
				if(second==-1 || arr[i]>arr[second])
					second =i;
			}
		}
		return second;
	}

}
