package greedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

class Activity{
	int start ;
	int finish ;
	Activity(int a, int b)
	{
		start = a;
		finish = b;
	}
}

class MyCmp implements Comparator<Activity>
{
	
	public int compare(Activity a , Activity b)
	{
		return a.finish - b.finish;
	}
}
public class ActivitySelection {

	public static void main(String[] args) {
		Activity [] arr = {new Activity(12,25), new Activity(10,20), new Activity(20,30)};
		System.out.println(maxActivity(arr));

	}
	
	public static int maxActivity(Activity[] arr)
	{

		Arrays.sort(arr, new MyCmp());
		int res = 1;
		int prev = 0;
		
		for(int curr = 1;curr<arr.length;curr++)
		{
			if(arr[curr].start >= arr[prev].finish)
			{
				res++;
				prev = curr;
			}
		}
		return res;
	}

}
