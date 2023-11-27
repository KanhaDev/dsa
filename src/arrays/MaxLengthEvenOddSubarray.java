package arrays;

public class MaxLengthEvenOddSubarray {

	public static void main(String[] args) {
		int [] arr = {10,3,12,5,8,4};
		System.out.println(maxLength(arr));

	}
	
	public static int maxLength(int [] arr)
	{
		int n = arr.length;
		int count=1,res = 1;
		for(int i =0;i<n-1;i++)
		{
			if((arr[i]%2==0 && arr[i+1]%2==1)||(arr[i]%2==1 && arr[i+1]%2==0)) 
				count++;
			else {
				res = Math.max(res, count);
				count =1;	
			}
		}
		
		return res;
	}

}
