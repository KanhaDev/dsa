package matrix;

public class RotateBy90Degree {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate90Degree(mat);

	}
	
	public static void rotate90Degree(int[][] mat)
	{
		int n = mat.length;
		for(int i =n-1;i>=0;i--)
		{
			for(int j =0;j<n;j++)
				System.out.print(mat[j][i]+" ");
			System.out.println();
		}
	}

}
