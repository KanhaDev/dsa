package arrays;

public class MinimumGroupFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 0, 0,1,1, 0, 0, 1 };
		printGroup(arr);

	}

	public static void printGroup(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				if (arr[i] != arr[0])
					System.out.print("From " + i + " to ");
				else
					System.out.println(i - 1);
			}
		}
		if(arr[n-1]!=arr[0])
			System.out.println(n-1);

	}

}
