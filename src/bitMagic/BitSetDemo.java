package bitMagic;

import java.util.BitSet;

public class BitSetDemo {

	public static void main(String[] args) {
		BitSet b = new BitSet(6);
		b.stream().forEach(System.out::print);
	}

}
