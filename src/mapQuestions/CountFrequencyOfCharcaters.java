package mapQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfCharcaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count frequency of each character in a string
		
		String str = "Kanhaiya Verma";
		Map<Character,Integer> map = new LinkedHashMap<>(); //Keep insertion order
		for(Character c : str.toCharArray()) {
			if(c != ' ')
				map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
		//Print unique characters
		String uniqueString = "";
		for(Map.Entry<Character,Integer> entrySet: map.entrySet()) {
			uniqueString = uniqueString+ entrySet.getKey();
		}
		System.out.println(uniqueString);
	}

}
