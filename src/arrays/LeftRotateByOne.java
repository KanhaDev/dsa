package arrays;

public class LeftRotateByOne {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		rotateLeft(arr);
		for(int i :arr)
			System.out.print(i+" ");
	}
	public static void rotateLeft(int[] arr)
	{
		int n =arr.length;
		int first = arr[0];
		for(int i =1;i<n;i++)
			arr[i-1] = arr[i]; 
		
		arr[n-1] = first;
	}

}
