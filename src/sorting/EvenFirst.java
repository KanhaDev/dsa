package sorting;

import java.util.Arrays;
import java.util.Comparator;

class Comp implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
			return o1%2-o2%2;
	}
	
}

public class EvenFirst {

	public static void main(String[] args) {
		Integer [] arr = {2,5,3,8,6,4};
		Arrays.sort(arr,new Comp());
		
		System.out.println(Arrays.toString(arr));

	}

}
