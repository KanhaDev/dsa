package greedyAlgo;

import java.util.Arrays;

class Item implements Comparable<Item>
{
	int wt , val;
	public Item(int w, int v)
	{
		wt = w;
		val = v;
	}
	@Override
	public int compareTo(Item i) {
		// TODO Auto-generated method stub
		return (this.wt) * (i.val) - (this.val) * (i.wt);
	}
}
public class FracKnapsack {

	public static void main(String[] args) {
		
		Item [] arr = {new Item(10,60) , new Item(40,40) , new Item(20,100) , new Item(30,120)};
		int W = 50;
		System.out.println(fracKnapsack(arr,W));

	}
	
	public static double fracKnapsack(Item[] arr, int W)
	{
		int n = arr.length;
		Arrays.sort(arr);
		double res = 0.0;
		
		for(int i = 0;i<n;i++)
		{
			if(arr[i].wt <= W)
			{
				res = res+ arr[i].val;
				W = W - arr[i].wt;
			}
			else {
				res = res + arr[i].val * (double) W / (double) arr[i].wt;
				break;
			}
		}
		return res;
	}

}
