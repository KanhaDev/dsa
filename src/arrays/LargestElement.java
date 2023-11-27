package arrays;

public class LargestElement {

	public static void main(String[] args) {

		int[] arr = { 10, 5, 20, 8 };
		int n = arr.length;
		System.out.println(largestElem(arr, n));

	}

	public static int largestElem(int[] arr, int n) {

		int max = 0;
		for (int i = 1; i < n; i++)
			if (arr[max] < arr[i])
				max = i;
		return max;
	}

}
