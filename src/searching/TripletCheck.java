package searching;

public class TripletCheck {

	//Find triplet in sorted array
	public static void main(String[] args) {
		int [] arr = {2,3,4,11,13,20,40};
		int x = 32;
		System.out.println(isTriplet(arr,x));
		System.out.println(isTriplet1(arr,x));
	}

	//Naive Solution Time - O(n^3)
	public static boolean isTriplet(int [] arr, int x)
	{
		int n = arr.length;
		for(int i=0; i<n;i++)
			for(int j =i+1;j<n;j++)
				for(int k =j+1;k<n;k++)
					if(arr[i]+arr[j]+arr[k]==x)
						return true;
		return false;
	}
	
	//Efficient Solution Time - O(n^2)
	
	public static boolean isTriplet1(int [] arr, int x)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			int left =i+1,right = n-1;
			while(left<right)
			{
				int sum = arr[left]+arr[right];
				if(x-arr[i]==sum)
					return true;
				else if(x-arr[i]>sum)
					left++;
				else
					right--;
			}
		}
		
		return false;
	}
}
