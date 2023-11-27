package sorting;
import java.util.Arrays;
import java.util.Comparator;
class Interval {
	int start;
	int end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

}

class MyComp3 implements Comparator<Interval>{

	@Override
	public int compare(Interval o1, Interval o2) {
		
		return (o1.start)-(o2.start);
	}
	
}
public class MergeOverlapIntervals {

	public static void main(String[] args) {

		Interval[] arr = { new Interval(1, 3), new Interval(2, 4), new Interval(5, 7), new Interval(6, 8) };
//		int n = arr.length;
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (checkOverlap(arr, i, j)) {
//					merge(arr, i, j);
//				}
//			}
//		}
//		for(int i =0;i<n;i++)
//		{
//			System.out.print("{"+arr[i].start +","+arr[i].end+"}  ");
//		}
		mergeIntervals(arr);
	}
	
	public static void mergeIntervals(Interval[] arr)
	{
		int n = arr.length;
		Arrays.sort(arr, new MyComp3());
		int res = 0;
		for(int i =1;i<n;i++)
		{
			if(arr[res].end>=arr[i].start)
			{
				arr[res].end = Math.max(arr[res].end, arr[i].end);
				arr[res].start = Math.min(arr[res].start, arr[i].start);
			}
			else {
				res++;
				arr[res]=arr[i];
			}
		}
		
		for(int i =0;i<=res;i++)
		{
			System.out.println(arr[i].start+" "+arr[i].end);
		}
	}

	public static boolean checkOverlap(Interval[] arr, int i, int j) {
		int s1 = arr[i].start;
		int s2 = arr[j].start;
		int e1 = arr[i].end;
		int e2 = arr[j].end;
		if (Math.min(e1, e2) >= Math.max(s1, s2) && Math.min(e1, e2) <= Math.max(e1, e2))
			return true;

		return false;
	}

	public static void merge(Interval[] arr, int i, int j) {
		int s1 = arr[i].start;
		int s2 = arr[j].start;
		int e1 = arr[i].end;
		int e2 = arr[j].end;

		arr[j].start = Math.min(s1, s2);
		arr[j].end = Math.max(e1, e2);
	}

}
