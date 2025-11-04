package mapQuestions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateElements {

	public static void main(String[] args) {
		//Input: [1, 2, 3, 2, 4, 1] → Output: [1, 2]
		
		int[] arr = {1,2,3,2,4,1};
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int i : arr ) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		//System.out.println(map);
		List<Integer> list = new ArrayList<>();
		
		for(Map.Entry<Integer,Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue() > 1) {
				list.add(entrySet.getKey());
			}
		}
		
		System.out.println(list);

	}

}
