package arrays;

public class MoveAllZeroesToEnd {

	public static void main(String[] args) {
		int [] arr = {8,5,0,10,0,20}; 
		moveZero(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}

	public static void moveZero(int[] arr)
	{
		int n = arr.length,count =0;
		for(int i =0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
	}
}
