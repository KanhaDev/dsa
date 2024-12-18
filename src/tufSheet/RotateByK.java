package tufSheet;

public class RotateByK {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int k = 4;
		rotateByK(arr,k);
		printArray(arr);
	}
	
	public static void printArray(int[] arr)
	{
		int n = arr.length;
		for(int i =0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void rotateByK(int[] arr ,int k)
	{
		int n = arr.length;
		if(n<=1)
			return;
			k = k%n;
		reverse(arr,0,n-1-k);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
		
	}
	
	public static void reverse(int[] arr ,int s , int e)
	{
		
		int mid = (e+s)/2;
		
		for(int i=s;i<=mid && e>=mid;i++)
		{
			int temp = arr[i];
			arr[i] = arr[e];
			arr[e] = temp;
			e--;
		}
	}
	

}
