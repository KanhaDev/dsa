package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {

	public static void main(String[] args)  {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Integer i = new Integer(10);
		 testFun(list,3,i);
		System.out.println(list);
	}

	@SuppressWarnings("hiding")
	public static <Integer> void testFun(List<Integer> list, Integer i, Integer i2) {
	
		for(ListIterator<Integer> it = list.listIterator();it.hasNext();)
		{
			if(i.equals(it.next()))
				it.set(i2);
		}
		
	}

}
