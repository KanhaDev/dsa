package arrays;

public class CheckSorted {

	public static void main(String[] args) {
		int[] arr = {200,200,200};
		System.out.println(checkSorted(arr)?"yes":"no");
	}
	public static boolean checkSorted(int[] arr)
	{
		int n = arr.length;
		for(int i=1;i<n-1;i++)
			if(arr[i]<arr[i-1])
				return false;
	
		
		return true;
	}

}
