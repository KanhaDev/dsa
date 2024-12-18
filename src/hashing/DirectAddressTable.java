package hashing;

public class DirectAddressTable {

	public static void main(String[] args) {
		boolean[] val = new boolean[1000];
		
		val[10] = true;
		val[20] = true;
		val[119] = true;
		System.out.println(val[10]);
		System.out.println(val[20]);
		val[119] = false;
		System.out.println(val[119]);

	}

}
