package pattern;

public class Pattern10 {

	public static void main(String[] args) {
		int n =25;
		for(int i =0;i<n;i++)
        {
            char start = (char) ('A'+ (n-1));
            for(int j =0;j<i+1;j++)
            {
                System.out.print(start--+" ");
            }
            System.out.println();
        }
	}

}
