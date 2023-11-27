package arrays;

public class MajorityElement {

	public static void main(String[] args) {

		int [] arr = {8,3,4,8};
		System.out.println(findMajority(arr));
	}

	// Efficient Solution O(n) Time
	public static int findMajority(int[] arr) {
		int n = arr.length;
		int res = 0, count = 1;
		for (int i = 0; i < n; i++) {
			if (arr[res] == arr[i])
				count++;
			else
				count--;
			if (count == 0) {
				res = i;
				count = 1;
			}
		}

		count = 0;
		for (int i = 0; i < n; i++)
			if (arr[res] == arr[i])
				count++;
		if (count <= (n / 2))
			res = -1;

		return res;
	}

}
