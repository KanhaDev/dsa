package collection_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arr {

	public static void main(String[] args) {
		List<Integer> fs = new ArrayList<>();
		fs.add(40);
		fs.add(23);
		fs.add(45);
		
		ListIterator<Integer> it = fs.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}
}
