package searching;

public class AllocateMinPages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40};
		int k =2;
		int n = arr.length;
		System.out.println(minPages(arr,n,k));
		System.out.println(minPages(arr,k));

	}
	
	//Naive Solution 
	public static int minPages(int [] arr,int n, int k)
	{
		
		if(n==1)
			return arr[0];
		if(k==1)
			return sum(arr,0,n-1);
		int res = Integer.MAX_VALUE;
		for(int i=1;i<n;i++)
		{
			res = Math.min(res, Math.max(minPages(arr,i,k-1), sum(arr,i,n-1)));
		}
		return res;
	}
	
	public static int sum(int [] arr, int b , int e)
	{
		int s = 0 ;
		for(int i = b; i<=e;i++)
			s+=arr[i];
		return s;
	}
	
	//Efficient Solution
	//Using Binary Search
	public static int minPages(int [] arr, int k)
	{
		int n = arr.length;
		int sum = 0 ,mx = 0;
		for(int i =0;i<n;i++)
		{
			sum+=arr[i];
			mx = Math.max(mx, arr[i]);
		}
		
		int low = mx , high = sum , res = 0;
		while(low<=high)
		{
			int mid = (low+high)/2;
			//System.out.println(mid+" "+low+" "+high);
			if(isFeasible(arr,k,mid))
			{
				res = mid;
				high = mid-1;
			}
			else
				low = mid+1;
		}
		
		return res;
	}
	
	public static boolean isFeasible(int [] arr, int k , int ans)
	{
		int n = arr.length;
		int req = 1 ,sum = 0;
		for(int i =0;i<n;i++)
		{
			if(sum+arr[i]>ans)
			{
				req++;
				sum = arr[i];
			}
			else
				sum+=arr[i];
		}
		return (req<=k);
	}

}
