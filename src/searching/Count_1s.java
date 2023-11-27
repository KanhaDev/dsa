package searching;

public class Count_1s {

	public static void main(String[] args) {
		int [] arr = {0,0,0,1,1,1,1};
		System.out.println(count1s(arr));

	}
	//The idea is to find the first occurrence of 1
	
	public static int count1s(int []arr)
	{
		int n = arr.length;
		int low = 0;
		int high = arr.length-1;
		while(high>=low)
		{
			int mid = (low+high)/2;
			
			if(arr[mid]==0)
				low = mid+1;
			else
			{
				if(mid==0 || arr[mid-1]!=1)
					return n-mid;
				else
					high = mid-1;
			}
		}
		
		return 0;
	}

}
