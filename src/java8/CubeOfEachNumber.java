package java8;


import java.util.List;

public class CubeOfEachNumber {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5);
		
		list.stream().map(e->e*e*e).forEach(System.out::println);

		//To print the maximum of number
		System.out.println(list.stream().map(e->e*e*e).reduce(Integer::max).get());

	}

}
