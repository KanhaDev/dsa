package bitMagic;

public class CountSetBitsTill_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countBit(4);
	}

	public static void countBit(int n)
	{
		 int res = 0;
	        while(n>0){
	        n=n/2;
	        res++;
	        }
	        int sum=0;
	        
	        
	        	sum=((1<<res)/2)*res/2;
	        
	       
	        System.out.println(sum);
	}
}
