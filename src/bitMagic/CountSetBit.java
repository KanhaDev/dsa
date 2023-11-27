package bitMagic;

public class CountSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		System.out.println(countBit(n));
		System.out.println(countBit1(n));
		System.out.println(countSetBit(n));
		System.out.println(countSetBit1(n));

	}
	
	//My Solution
	public static int countBit(int n) {
		int count =0;
		for(int i=1;i<=32;i++) {
			int x = (n>>(i-1));
			if((1&x)!=0)
				count++;
		}
	return count;
	}

	//Naive Solution
	public static int countBit1(int n) {
		int count =0;
		while(n>0) {
//			if((n&1)!=0)
//			count++;
			//These two lines can be replaced by following line
			count+=(n&1);
			n=n/2;
		}
	return count;
	}
	
	//Efficient Solution (Brian Kerningam's Algorithm)
	public static int countSetBit(int n) 
	{
		int count = 0;
		while(n>0) {
			n= n&(n-1);
			count++;
		}
		return count;
	}
	
	 //Lookup Table Solution
	
	static int [] tbl = new int[255]; //Lookup Table
	
	//Pre-processing
	public static void intialize() 
	{
		tbl[0] = 0;
		for(int i=1;i<255;i++)
			tbl[i] = tbl[i&(i-1)]+1;
		
	}
	
	public static int countSetBit1(int n) 
	{
		intialize();
		return tbl[n&255]+tbl[(n>>8)&255]+tbl[(n>>16)&255]+tbl[(n>>24)];
	}
}
