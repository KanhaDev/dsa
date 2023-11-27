package practice;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(25);
		list.add(5);
		list.add(17);
		list.add(13);
		TreeSet t = new TreeSet(list);
		
	
		System.out.println(t);
		

	}

}
