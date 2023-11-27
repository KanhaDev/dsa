package arrays;

public class RemoveDuplicatesInSorted {

	public static void main(String[] args) {
		int [] arr = {10,20,20,30,30,30,30};
		System.out.println(removeDuplicates(arr));	
	}

	public static int removeDuplicates(int[] arr)
	{
		int n = arr.length,res = 1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]!=arr[res-1]) {
				arr[res] = arr[i];
				res++;
			}	
		}
		return res;
	}
}
