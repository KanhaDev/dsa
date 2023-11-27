package sorting;

import java.util.Arrays;
import java.util.Comparator;

class Point1{
	int x , y ;
	Point1(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class Mycmp implements Comparator<Point>{

	@Override
	public int compare(Point p1, Point p2) {
		return p2.x-p1.x;
	}
	
}
public class ArraysSortComparator {

	public static void main(String[] args) {
		
		Point [] arr = {new Point(10,20), new Point(3,12), new Point(5,7)};
		
		Arrays.sort(arr,new Mycmp());
		
		for(int i =0;i<arr.length;i++)
			System.out.println(arr[i].x+" "+arr[i].y);
		
	}

}
