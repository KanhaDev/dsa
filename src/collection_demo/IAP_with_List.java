package collection_demo;

import java.util.ArrayList;
import java.util.List;

public class IAP_with_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> arr = new ArrayList<>();
		arr.add(87);
		arr.add(101);
		arr.add(108);
		arr.add(99);
		arr.add(111);
		arr.add(109);
		arr.add(101);
		
		String str ="";
		for(Integer i:arr) {
			str+=Character.toString(i);
		}
		System.out.println(str);
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
