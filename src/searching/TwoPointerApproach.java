package searching;

public class TwoPointerApproach {

	public static void main(String[] args) {
		int [] arr = {2,5,8,12,30};
		int x = 17;
		System.out.println(isPair(arr,x));
		System.out.println(isPair1(arr,x));
	}
	
	//Naive Solution Time - O(n^2)
	public static boolean isPair(int []arr, int x)
	{
		int n =arr.length;
		for(int i =0;i<n;i++)
		{
			for(int j =i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==x)
					return true;
			}
		}
		return false;
	}
	
	//Efficient Solution Time - O(n)
	public static boolean isPair1 (int[] arr, int x)
	{
		int n = arr.length;
		int i = 0 , j = n-1;
		while(i<j)
		{
			if(arr[i]+arr[j]==x)
				return true;
			else if(arr[i]+arr[j]>x)
				j--;
			else
				i++;
		}
		return false;
	}

}
