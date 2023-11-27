package mathematics;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(countDigit(n));

	}
	public static int countDigit(int n) {
		int count = 0;
		
		while(n>0) {
		n/=10;
		count++;
		}
		return count;
	}

}
