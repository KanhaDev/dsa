package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point3{
	int x , y ;
	Point3(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
}

class Mycomp implements Comparator<Point3>
{

	@Override
	public int compare(Point3 o1, Point3 o2) {
		
		return o1.x-o2.x;
	}
	
}
public class CollectionSortComparator {

	public static void main(String[] args) {
		List<Point3> list = new ArrayList<>();
		list.add(new Point3(5,10));
		list.add(new Point3(2,20));
		list.add(new Point3(10,30));
		Collections.sort(list,new Mycomp());
		for(Point3 p :list)
			System.out.println(p.x+" "+p.y);
	}

}
