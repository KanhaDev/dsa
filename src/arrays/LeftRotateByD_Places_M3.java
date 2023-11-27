package arrays;

public class LeftRotateByD_Places_M3 {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		int d =3;
		leftRotate(arr,d);
		for(int i:arr)
			System.out.print(i+" ");

	}
	public static void leftRotate(int []arr, int d)
	{
		int n = arr.length;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	public static void reverse(int[] arr, int low , int high)
	{
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
