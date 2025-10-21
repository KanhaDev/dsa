package greedyAlgo;

public class MinimumJump {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		System.out.println(minJumps(arr));
	}

	private static int minJumps(int[] arr) {
		int count = 0;
		int n = arr.length;
		int l = 0, r = 0;
		while (r < n - 1) {
			int maxLen = 0;
			for (int i = l; i <= r; i++) {
				maxLen = Math.max(maxLen, i + arr[i]);
			}
			l = r + 1;
			r = maxLen;
			count++;
		}
		return count;
	}

}


