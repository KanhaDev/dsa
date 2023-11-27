package searching;

public class SqaureRoot {

	public static void main(String[] args) {
		int x = 178;
		System.out.println(sqRootFloor(x));
		System.out.println(sqRootFloor1(x));
	}
	
	//Naive SOlution O(n/2)
	public static int sqRootFloor(int x)
	{
		int i = 1;
		while(i*i<=x)
			i++;
		return i-1;
	}
	//Efficient Solution O(log n)
	public static int sqRootFloor1(int x)
	{
		int low = 1 , high = x , ans = -1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			int mSq = mid*mid;
			if(mSq == x)
				return mid;
			else if(mSq>x)
				high = mid-1;
			else
			{
				low = mid+1;
				ans = mid;
			}	
		}
		return ans;
	}
}
