package recursion;

import java.util.ArrayList;

public class GenerateSubset {

	public static void main(String[] args) {
		
		String str = "ABC";
		
//		subset(str," ",0);
		int [] arr = {3,1,2};
		
		ArrayList<Integer> list = new ArrayList<>();
		printSubset(arr,list,0);
		

	}
	
	public static void subset(String s , String curr,int i) {
		if(i==s.length())
		{
			System.out.println(curr);
			return;
		}
		subset(s,curr,i+1);
		subset(s,curr+s.charAt(i),i+1);
	}
	
	private static void printSubset(int[] arr, ArrayList<Integer> list, int i)
	{
		if(i >= arr.length)
		{
			System.out.println(list);
			return;
		}
		//not take case
		printSubset(arr,list,i+1);
		list.add(arr[i]);
		//take case
		printSubset(arr,list,i+1);
		//after taking we are removing last element from the list
		list.remove(list.size()-1);
	}

}
