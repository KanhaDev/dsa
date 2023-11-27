package sorting;

import java.util.Arrays;

public class MeetingMaxGuest {

	public static void main(String[] args) {
		int[] arr = {900,940,950,1100,1500,1800};
		int[] dep = {910,1200,1120,1130,1900,2000};
		System.out.println(meetMax(arr,dep));

	}
	
	public static int meetMax(int[] arr , int[] dep)
	{
		int n = arr.length;
		Arrays.sort(arr);
		Arrays.sort(dep);
		int res = 0;
		int i =0 , j =0;
		int max = 0;
		while(i<n && j<n)
		{
			if(arr[i]<=dep[j])
			{
				res++;
				i++;
				
			}
			else {
				res--;
				j++;
			}
			max = Math.max(max, res);
		}
		
		return max;
	}

}
