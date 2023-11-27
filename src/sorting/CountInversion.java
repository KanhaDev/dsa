package sorting;

public class CountInversion {

	public static void main(String[] args) {
		int[] arr = {2,4,1,3,5};
		int[] arr2= {40,30,20,10};
		System.out.println(countInversion(arr));
		System.out.println(countInv(arr,0,arr.length-1));
		System.out.println(countInversion(arr2));
		System.out.println(countInv(arr2,0,arr2.length-1));
	}

	//Naive Solution      Time : O(n^2)
	public static int countInversion(int[] arr) {
		int n = arr.length;
		int count = 0;
		for(int i =0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if(arr[i]>arr[j])
					count++;
		return count;
	}

	//Efficient Solution  Time  :O(n log n)
	/* This can be solve using merge sort algorithm
	 * It is very similar to merge sort */
	public static int countInv(int[] arr ,int l ,int r)
	{
		int res = 0;
		if(l<r)
		{
			int m = l+(r-l)/2;
			res += countInv(arr ,l,m);
			res += countInv(arr ,m+1,r);
			res += countAndMerge(arr,l,m,r);	
		}
		return res;
	}
	
	public static int countAndMerge(int[] arr , int l , int m , int r)
	{
		int n1 = m-l+1;
		int n2 = r-m;
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i =0;i<n1;i++)
			left[i] = arr[l+i];
		for(int i =0;i<n2;i++)
			right[i] = arr[m+i+1];
		int res = 0,i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				arr[k] = left[i];
				i++;
			}
			else 
			{
				arr[l] = right[j];
				j++;
				res = res+(n1-i);
			}
			k++;
		}
		while(i<n1)
		{
			arr[k] = left[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			arr[k] = right[j];
			k++;
			j++;
		}
		return res;
	}
	
}
