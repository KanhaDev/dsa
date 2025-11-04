package mapQuestions;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortAMapByValue {

	public static void main(String[] args) {
		//Input: {a=10, b=5, c=20}
		//Output: {b=5, a=10, c=20}
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		map.put('a', 10);
		map.put('b', 5);
		map.put('c', 20);
		map.put('d', 10);
		
		Comparator<Character> valueCompare = new Comparator<>() {

			@Override
			public int compare(Character o1, Character o2) {
				int comp = map.get(o1).compareTo(map.get(o2));
				if(comp == 0)
					return o1.compareTo(o2);
				return comp;
			}
			
		};
		
		Map<Character,Integer> sortedMap = new TreeMap<>(valueCompare);
		sortedMap.putAll(map);
		System.out.println(sortedMap);

	}
	
	

}
