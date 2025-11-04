package mapQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfWords {

	public static void main(String[] args) {
		//Count frequency of each word in a sentence
		//Input: "Java is fun and Java is powerful"
		//Output: {Java=2, is=2, fun=1, and=1, powerful=1}
		String input = "Java is fun and Java is powerful";
		Map<String,Integer> map = new LinkedHashMap<>();
		
		String [] strArray = input.split(" ");
		for(String str: strArray) {
			map.put(str, map.getOrDefault(str, 0)+1);
		}
		System.out.println(map);
	}

}
