package arrays;

public class StockBuySell_Naive {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 8,12 };
		int start = 0, n = arr.length;
		int end = n - 1;
		System.out.println("Max Profit : " + maxProfit(arr, start, end));
	}

	public static int maxProfit(int[] price, int start, int end) {
		if (start >= end)
			return 0;
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (price[j] > price[i]) {
					int curr_profit = price[j] - price[i] + maxProfit(price, start, i - 1)
							+ maxProfit(price, j + 1, end);
					profit = Math.max(profit, curr_profit);
				}
			}
		}
		return profit;
	}
}