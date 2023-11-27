package arrays;

public class MaximumCircularSubarraySum {

	public static void main(String[] args) {

		int[] arr = { 5, -2, 3, 4 };
		System.out.println(maxCircularSum(arr));
		System.out.println(overallMaxSum(arr));

	}
	// Efficient Solution O(n) Time Complexity

	public static int maxNormalSum(int[] arr) {
		int n = arr.length;
		int max = arr[0], sum = arr[0];
		for (int i = 1; i < n; i++) {
			sum = Math.max(arr[i], sum + arr[i]);
			max = Math.max(max, sum);
		}
		return max;
	}

	public static int overallMaxSum(int[] arr) {
		int n = arr.length;
		int max_normal = maxNormalSum(arr);

		if (max_normal < 0)
			return max_normal;
		int arr_sum = 0;
		for (int i = 0; i < n; i++) {
			arr_sum += arr[i];
			arr[i] = -arr[i];
		}
		int max_circular = arr_sum + maxNormalSum(arr);
		return Math.max(max_normal, max_circular);
	}

	// Naive Solution O(n^2) Time Complexity
	public static int maxCircularSum(int[] arr) {
		int n = arr.length;
		int res = arr[0];
		for (int i = 0; i < n; i++) {
			int curr_max = arr[i];
			int curr_sum = arr[i];

			for (int j = 1; j < n; j++) {
				int index = (i + j) % n;
				curr_sum += arr[index];
				curr_max = Math.max(curr_max, curr_sum);
			}

			res = Math.max(curr_max, res);
		}

		return res;
	}

}
