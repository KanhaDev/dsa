package collection_demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	/*** 
	 * Map(Interface)--> unique key but can have duplicate value
	 *           |
	 * 1. HashMap(class) --> fast and unordered --> can have null key and values
	 * 2. TreeMap(class) --> sorted by key  --> can not have null key
	 * 3. LinkedHashMap --> ordered by insertion ---> can have null key and values
	 * 
	 * Map can not be traversed , so we need to convert it into keySet or entrySet
	 * 
	 * ***/
	public static void main(String[] args) {
		
		//Create a HashMap object using Map interface as reference
		Map<Integer,String> map = new HashMap<>();
		
		//1. put(K key, V value) – Adds or replaces an entry
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Carrot");
		map.put(4, "Dog");
		map.put(5, "Elephant");
		
		//2. Get method to return the value at the key --> get(Object key) – Retrieves value by key
		System.out.println("Get value of key 2: "+map.get(2));
		//3. Check if a key is Present in the map --> containsKey(Object key) – Checks if key exists
		System.out.println("Key 4 is present: "+map.containsKey(4));
		//4. Check if a value is present in the map --> containsValue(Object value) – Checks if value exists
		System.out.println("Value \"Apple\" is present: "+map.containsValue("Apple"));
		//5. Get the size of the map --> size() – Returns number of key-value pairs
		System.out.println("Size of the map is: "+ map.size());
		//6. Check if the map is empty --> isEmpty() – Checks if map is empty
		System.out.println("Map is empty: "+map.isEmpty());
		//7. Get all keys of the map --> keySet() – Returns all keys as a Set
		System.out.println("All keys of the map are : "+ map.keySet());
		//8. Get all values of the map --> values() – Returns all values as a Collection
		System.out.println("All the values of the map are: "+ map.values());
		//9. EntrySet --> entrySet() – Returns all entries as a Set<Map.Entry>
		for(Map.Entry<Integer,String> entrySet: map.entrySet()) {
			System.out.println("EntrySet key: "+ entrySet.getKey() +" and Value: "+ entrySet.getValue());
		}
		//10. Put only if key is not present --> putIfAbsent(K key, V value) – Adds only if key is not present
		map.putIfAbsent(6, "Forest");
		//11. replace(K key, V newValue) – Updates value for an existing key
		map.replace(2, "Blackberry");
		//12. getOrDefault --> Important method --> getOrDefault(K key, V defaultValue)
		System.out.println("Key 6 (Default) : " +map.getOrDefault(6,"Not Found"));
		System.out.println("Key 8 (Default) : " +map.getOrDefault(8,"Not Found"));
	}

}
