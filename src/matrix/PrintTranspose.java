package matrix;

public class PrintTranspose {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printTranspose(mat);

	}
	
	public static void printTranspose(int[] [] mat)
	{
		int R = mat.length;
		
		for(int i =0;i<R;i++)
		{
			int C = mat[i].length;
			for(int j =0;j<C;j++)
				System.out.print(mat[j][i] +" ");
			System.out.println();
		}
	}

}
