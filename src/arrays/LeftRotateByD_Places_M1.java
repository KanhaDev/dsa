package arrays;

public class LeftRotateByD_Places_M1 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int d = 2;
		
		leftRotate(arr,d);
		for(int i :arr)
			System.out.print(i+" ");
	}
	
	public static void leftRotateOne(int[] arr)
	{
		int n = arr.length;
		int first = arr[0];
		for(int i =1;i<n;i++)
		{
			arr[i-1] = arr[i];
		}
		arr[n-1] = first;
	}

	public static void leftRotate(int[] arr, int d)
	{
		for(int i=0;i<d;i++)
			leftRotateOne(arr);
	}
}
