package mapQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		//input: "swiss" → Output: 'w'
		
		String input = "swiss";
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(Character ch: input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		//System.out.println(map);
		for(Map.Entry<Character,Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue() == 1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}

	}

}
