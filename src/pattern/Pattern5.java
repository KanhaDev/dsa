package pattern;

public class Pattern5 {

	public static void main(String[] args) {
		int count = 1;
		int n =5;
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print((count++)+" ");
            }
            System.out.println();
        }
	}

}
