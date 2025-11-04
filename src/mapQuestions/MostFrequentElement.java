package mapQuestions;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

	public static void main(String[] args) {
		//Input: [2, 3, 2, 5, 3, 2] → Output: 2
		
		int [] input = {3,2,2,5,3,3,2,3};
		Map<Integer,Integer> map = new HashMap<>();
		for(int i: input) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		int max = 0;
		int val = -1;
		for(Map.Entry<Integer,Integer> entrySet : map.entrySet()) {
			if(max < entrySet.getValue()) {
				max = entrySet.getValue();
				val = entrySet.getKey();
			}	
		}
		
		System.out.println(val);

	}

}
