package searching;


public class CountOccurences {

	public static void main(String[] args) {
		int [] arr = {10,20,20,20,30,30};
		int x = 20;
		System.out.println(countOcc(arr,x));
		System.out.println(countOccurrence(arr,x));

	}

	//Naive Solution O(n)
	public static int countOcc(int [] arr, int x)
	{
		int count = 0;
		for(int i =0;i<arr.length;i++)
			if(arr[i]==x)
				count++;
		return count;
	}
	
	//Efficient Solution Time - O(log n)
	//Basically here we will find first and last occurrence using binary search
	public static int countOccurrence(int [] arr , int x)
	{
		int n = arr.length;
		int first = IndexOfFirstOccurence.firstOccurence(arr,0,n-1,x);
		if(first==-1)
			return 0;
		else return (IndexOfLastOccurence.lastOccurence(arr,x)-first+1);
	}
	
}
