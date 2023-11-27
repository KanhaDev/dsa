package sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int [] arr1 = {10,15,20};
		int [] arr2 = {5,6,6,15};
		mergeSorted(arr1,arr2);
	}
	
	public static void mergeSorted(int [] arr1, int [] arr2)
	{
		int n = arr1.length;
		int m = arr2.length;
		int i =0, j = 0;
		int [] arr = new int[n+m];
		int k =0;
		while(i<n || j< m)
		{
			if(i==n)
			{
				arr[k] = arr2[j];
				j++;
				k++;
			}
			else if(j==m)
			{
				//System.out.println(i+" "+j+" "+arr1[i]);
				arr[k] = arr1[i];
				i++;
				k++;
			}
			else if(arr1[i]>=arr2[j])
			{
				arr[k] = arr2[j];
				j++;
				k++;
			}
			else
			{
				arr[k] =arr1[i];
				i++;
				k++;
			}
		}
		//System.out.println(i+" "+j+" "+arr1[i]);
		System.out.println(Arrays.toString(arr));
	}

}
