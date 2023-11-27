package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsDemo {

	public static void main(String[] args) 
	{
		List<Integer> list1 = List.of(2, 4, 21, 22, 67, 34, 41);
 		List<Integer> list2 = new ArrayList<>();
		list2.add(23);
		list2.add(12);
		list2.add(7);
		list2.add(64);
		list2.add(45);
		
		List<Integer> list3 = Arrays.asList(34,23,13,44,33);
		
		//list1 to add all even in another list listEven
		//Without Stream
		List<Integer> listEven = new ArrayList<>();
		
		for(Integer i :list1)
		{
			if(i%2==0)
			{
				listEven.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(listEven);
		
		//With stream
		
//		Stream<Integer> stream = list1.stream();
//		List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> newList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(newList);
		
	}
}
