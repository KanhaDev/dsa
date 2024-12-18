package pattern;

public class Pattern9 {

	public static void main(String[] args) {
		int n = 12;
		for(int i =0;i<n;i++)
		{
			char start = 'A';
			for(int j=0;j<(2*n-(2*i+1))-1;j++)
			{
				System.out.print(" ");
			}
			for(int j =0;j<i+1;j++)
			{
				System.out.print((start++)+" ");
			}
			for(int j =0;j<i;j++)
			{	
				if(j==0)
				start--;
				System.out.print((--start)+" ");
			}
			for(int j=0;j<2*n-(2*i+1);j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
