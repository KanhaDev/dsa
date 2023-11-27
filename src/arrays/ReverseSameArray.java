package arrays;

public class ReverseSameArray {

	public static void main(String[] args) {
		int[] arr = {10,5,7,30};
		reverse(arr);
		for(int i :arr)
		System.out.print(i+" ");

	}
	
	public static void reverse(int[] arr)
	{
		int n = arr.length;
		int low = 0,high = n-1;
		while(low<high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			high--;
			low++;
		}
	}

}
