package arrays;

public class LeadersInArray_Rev {

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 6, 5, 2 };

		leader(arr);

	}

	public static void leader(int[] arr) {
		int n = arr.length;
		int currLeader = arr[n - 1];
		System.out.print(currLeader + " ");
		for (int i = n - 2; i>=0; i--) {
			if (arr[i] > currLeader) {
				currLeader = arr[i];
				System.out.print(currLeader + " ");
			}
		}
	}

}
