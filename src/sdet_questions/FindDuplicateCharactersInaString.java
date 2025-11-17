package sdet_questions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInaString {

	public static void main(String[] args) {
		String str = "My name is Kanhaiya";
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			if(ch != ' ')
			map.put(ch, map.getOrDefault(ch,0) + 1);
		}
		
		for(Map.Entry<Character,Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue() > 1) {
				System.out.print(entrySet.getKey() +" - "+ entrySet.getValue()+" , ");
			}
		}
		
		//Count Occurrences of Each Characters
		
		for(Map.Entry<Character,Integer> entrySet : map.entrySet()) {
				System.out.print(entrySet.getKey() +" - "+ entrySet.getValue()+" , ");
		}

	}

}
