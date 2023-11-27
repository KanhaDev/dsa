package recursion;

public class Rope_Cutting_Max {

	public static void main(String[] args) {
		int n=9,a=2,b=2,c=2;
		System.out.println(maxCut(n,a,b,c));

	}
	
	public static int maxCut(int n,int a,int b,int c)
	{
		if(n==0)
			return 0;
		if(n<0)
			return -1;
		int res = Math.max(maxCut(n-c,a,b,c), Math.max(maxCut(n-a,a,b,c), maxCut(n-b,a,b,c)));
		if(res==-1)
			return -1;
		return res+1;
			
	}

}
