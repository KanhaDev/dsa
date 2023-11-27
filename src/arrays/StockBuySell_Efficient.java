package arrays;

public class StockBuySell_Efficient {

	public static void main(String[] args) {
		
		int [] arr = {1,5,3,1,2,8};
		System.out.println(maxProfit(arr));
 	}
	
	public static int maxProfit(int [] price)
	{
		
		int profit =0 , n = price.length;
		for(int i=1;i<n;i++)
			if(price[i]>price[i-1])
				profit+=(price[i]-price[i-1]);
		return profit;
	}

}
