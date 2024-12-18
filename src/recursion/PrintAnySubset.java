package recursion;

import java.util.ArrayList;

public class PrintAnySubset {

	public static void main(String[] args) {
		int [] arr = {1,2,1,2};
		int sum = 2;
		ArrayList<Integer> list = new ArrayList<>();
		printSubset(arr ,list, sum , 0 , 0);
		
	}
	
	private static boolean printSubset(int[] arr,ArrayList<Integer> list, int sum , int s , int i)
	{
		if(i == arr.length)
		{
			if(sum == s)
			{
				System.out.println(list);
				return true;
			}
			return false;
		}
		
		s += arr[i];
		list.add(arr[i]);
		if(printSubset(arr,list, sum , s , i+1) == true)
			return true;
		
		s -= arr[i];
		list.remove(list.size()-1);
		if(printSubset(arr,list, sum , s ,i+1) == true)
			return true;
		
		return false;
	}

}
